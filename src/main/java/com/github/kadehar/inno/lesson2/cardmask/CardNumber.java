package com.github.kadehar.inno.lesson2.cardmask;

/**
 * Представляет из себя номер банковской карты.
 * @param value Номер карты с пробелами или без
 */
public record CardNumber(String value) {
    /** Проверяет что номер карты валиден. */
    public boolean isValid() {
        return !value.isBlank() && !value.isEmpty() && !(value.length() < 16);
    }

    /** Удаляет все пробелы в номере карты для корректной работы маски. */
    public String normalize() {
        return value.replaceAll(" ", "");
    }
}
