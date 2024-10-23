package com.github.kadehar.inno.lesson2.flat;

import java.util.List;

/**
 * Класс, описывающий квартиру.
 * @param rooms Комнаты в квартире
 * @param floor Этаж
 */
public record Flat(List<Room> rooms, int floor) {

    /** Возвращает информацию о квартире. */
    public String info() {
        return String.format("Этаж: %d,\nКоличество комнат: %d,\nКомнаты: \n%s",
                floor, rooms.size(), roomsString());
    }

    /** Собирает из списка комнат единую строку с информацией. */
    private String roomsString() {
        StringBuilder builder = new StringBuilder();
        rooms.forEach(room -> builder.append("- ").append(room.toString()).append("\n"));
        return builder.toString();
    }
}
