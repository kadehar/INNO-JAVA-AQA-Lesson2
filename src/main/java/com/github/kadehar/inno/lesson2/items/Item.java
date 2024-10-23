package com.github.kadehar.inno.lesson2.items;

/**
 * Класс, описывающий единицу товара.
 */
public class Item {
    private final String name;
    private final double price;
    private final ItemProperties properties;

    /**
     * Создаёт новый товар в системе.
     * @param name Наименование товара
     * @param price Цена товара
     * @param properties Характеристики товара
     */
    public Item(String name, double price, ItemProperties properties) {
        this.name = name;
        this.price = price;
        this.properties = properties;
    }

    /**
     * Создаёт новый товар в системе с установленной ценой 0.0.
     * @param name Наименование товара
     * @param properties Характеристики товара
     */
    public Item(String name, ItemProperties properties) {
        this(name, 0.0, properties);
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }

    public ItemProperties properties() {
        return properties;
    }

    /**
     * Возвращает информацию о товаре.
     * Если цена равна нулю, то она не выводится.
     * @link <a href="https://stackoverflow.com/a/50319779">Подробнее</a>
     */
    public String info() {
        String priceString = price != 0.0 ? "%3$.2f - " : "";
        return String.format(
                "%1$s - %2$s - " + priceString + "%4$d - %5$.2f - [%6$s]",
                properties.article(),
                name,
                price,
                properties.count(),
                properties.weight(),
                properties.color().name()
        );
    }
}
