package com.github.kadehar.inno.lesson2.flat;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Room bedroom = new Room("Спальня", 16, 3);
        Room guestroom = new Room("Гостиная", 20, 5);
        Flat flat = new Flat(List.of(bedroom, guestroom), 5);
        System.out.println(flat.info());
    }
}
