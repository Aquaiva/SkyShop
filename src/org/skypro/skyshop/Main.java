package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        ProductBasket basket = new ProductBasket("Корзина1", "Пользователь1");
        Product product1 = new Product("Ноутбук", 1000);
        Product product2 = new Product("Смартфон", 800);
        Product product3 = new Product("HDMI кабель", 20);
        Product product4 = new Product("Наушники", 200);
        Product product5 = new Product("Звуковая карта", 300);
        Product product6 = new Product("Аудиосистема", 1000);
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);
        basket.addProduct(product6);
        basket.printCartContents();

        System.out.println("Найти 'Смартфон':" + (basket.findProduct("Смартфон") ? "найден" : "не найден"));
        System.out.println("Найти 'Аудиосистема':" + (basket.findProduct("Аудиосистема") ? "найден" : "не найден"));
        basket.calculateTotalPrice();
        basket.clearCart();
        basket.calculateTotalPrice();
        basket.printCartContents();
        System.out.println("Найти 'Смартфон':" + (basket.findProduct("Смартфон") ? "найден" : "не найден"));
     }
}
