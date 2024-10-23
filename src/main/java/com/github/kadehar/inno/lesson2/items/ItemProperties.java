package com.github.kadehar.inno.lesson2.items;

/**
 * Класс, содержащий характеристики продукта.
 * @param article Артикул товара
 * @param count Кол-во товара
 * @param weight Вес товара (г.)
 * @param color Цвет товара
 */
public record ItemProperties(String article, int count, double weight, Color color) {}