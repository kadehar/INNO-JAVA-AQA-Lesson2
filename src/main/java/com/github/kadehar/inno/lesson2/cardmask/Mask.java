package com.github.kadehar.inno.lesson2.cardmask;

/**
 * Представляет класс, предоставляющий маску, где: <br>
 *  - * - символ сокрытия цифры; <br>
 *  - X - символ подстановки числа. <br>
 *
 *  Если маска не была указана, то по умолчанию используется "**** **** **** XXXX".
 */
public class Mask {
    private static final String DEFAULT = "**** **** **** XXXX";
    private final String mask;

    public Mask(String mask) {
        this.mask = mask;
    }

    public Mask() {
        this(DEFAULT);
    }

    public String mask() {
        return mask;
    }
}
