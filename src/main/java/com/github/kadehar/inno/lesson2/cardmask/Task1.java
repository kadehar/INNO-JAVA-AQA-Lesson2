package com.github.kadehar.inno.lesson2.cardmask;

public class Task1 {
    public static void main(String[] args) {
        CardNumber cardWithSpaces = new CardNumber("1234 5678 9012 3456");
        CardNumber cardNoSpaces = new CardNumber("1234567890123456");

        Mask defaultMask = new Mask();
        Mask showFirstAndLast = new Mask("XXXX **** **** XXXX");

        CardNumberHider withDefault = new CardNumberHider(cardWithSpaces, defaultMask);
        System.out.printf("%s => %s [Маска: %s]%n",
                cardWithSpaces.value(), withDefault.hide(), defaultMask.mask());
        withDefault = new CardNumberHider(cardNoSpaces, defaultMask);
        System.out.printf("%s => %s [Маска: %s]%n",
                cardNoSpaces.value(), withDefault.hide(), defaultMask.mask());

        CardNumberHider firstAndLast = new CardNumberHider(cardWithSpaces, showFirstAndLast);
        System.out.printf("%s => %s [Маска: %s]%n",
                cardWithSpaces.value(), firstAndLast.hide(), showFirstAndLast.mask());
        firstAndLast = new CardNumberHider(cardNoSpaces, showFirstAndLast);
        System.out.printf("%s => %s [Маска: %s]%n",
                cardNoSpaces.value(), firstAndLast.hide(), showFirstAndLast.mask());
    }
}
