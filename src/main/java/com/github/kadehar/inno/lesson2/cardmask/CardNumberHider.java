package com.github.kadehar.inno.lesson2.cardmask;

/**
 * Класс, содержащий алгоритм сокрытия номера карты по маске.
 */
public class CardNumberHider {
    private final CardNumber cardNumber;
    private final Mask mask;

    public CardNumberHider(CardNumber cardNumber, Mask mask) {
        this.cardNumber = cardNumber;
        this.mask = mask;
    }

    /**
     * Скрывает числовые символы на карте согласно маске, если номер карты валиден.
     * @return Пустую строку, если номер карты не валиден, иначе номер карты, сокрытый по маске.
     */
    public String hide() {
        if (!cardNumber.isValid()) {
            return "";
        }

        String card = cardNumber.normalize();
        String cardMask = mask.mask();
        int maskLength = cardMask.length();
        int index = 0;
        StringBuilder maskedCard = new StringBuilder();
        for (int i = 0; i < maskLength; i++) {
            char symbol = cardMask.charAt(i);
            if (symbol == 'X') {
                maskedCard.append(card.charAt(index));
                index++;
            } else if (symbol == '*') {
                maskedCard.append(symbol);
                index++;
            } else {
                maskedCard.append(symbol);
            }
        }
        return maskedCard.toString();
    }
}
