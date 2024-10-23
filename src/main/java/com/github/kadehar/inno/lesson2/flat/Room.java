package com.github.kadehar.inno.lesson2.flat;

/**
 * Класс, описывающий комнату.
 * @param name Наименование комнаты (Например, спальня)
 * @param squareMeters Метраж комнаты
 * @param windows Количество окон
 */
public record Room(String name, double squareMeters, int windows) {
    @Override
    public String toString() {
        return String.format("%s: [Метраж: %.2f, Окон: %d]", name, squareMeters, windows);
    }
}