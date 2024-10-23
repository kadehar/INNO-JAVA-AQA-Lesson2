package com.github.kadehar.inno.lesson2.items;

public class Task3 {
    public static void main(String[] args) {
        ItemProperties iPhoneProperties = new ItemProperties(
                "IT-4735-B",
                99,
                146.3,
                Color.Red
        );
        Item iPhone = new Item(
                "iPhone 15 Pro Max",
                135_000.0,
                iPhoneProperties
        );

        ItemProperties keyboardProperties = new ItemProperties(
                "KB-74569012",
                350,
                130.0,
                Color.Green
        );
        Item keyboard = new Item(
                "Oclick Keynote 12",
                2_000.0,
                keyboardProperties
        );

        ItemProperties freeProductProperties = new ItemProperties(
                "FR-GHTX-1234",
                50,
                12.75,
                Color.Black
        );
        Item freeProduct = new Item(
                "Free Welcome Gift!",
                freeProductProperties
        );

        ItemProperties xboxProperties = new ItemProperties(
                "XB-GFBTY-123L",
                75,
                250.4,
                Color.Blue
        );
        Item xbox = new Item(
                "XBox 360 Lite SE",
                56_000.70,
                xboxProperties
        );

        ItemProperties laptopProperties = new ItemProperties(
                "LP-VBT-13456T",
                375,
                1500.75,
                Color.White
        );
        Item laptop = new Item(
                "Sony Vayo 15 CE",
                45_500.75,
                laptopProperties
        );

        System.out.println(iPhone.info());
        System.out.println(keyboard.info());
        System.out.println(freeProduct.info());
        System.out.println(xbox.info());
        System.out.println(laptop.info());
    }
}
