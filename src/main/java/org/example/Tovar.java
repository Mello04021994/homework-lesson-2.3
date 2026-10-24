package org.example;

class Tovar {
    public String name;
    public String productionDate;
    public String manufacturer;
    public String countryOfOrigin;
    public double price;
    public boolean isBooked;

    public Tovar(String name, String productionDate, String manufacturer,
                 String countryOfOrigin, double price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void printInfo() {
        System.out.println("__________________________________________");
        System.out.println("-ИНФОРМАЦИЯ О ТОВАРЕ-");
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Состояние бронирования покупателем: " + (isBooked ? "Да" : "Нет"));
        System.out.println("__________________________________________");
    }
}
class Main {
    public static void main(String[] args) {
        Tovar[] productsArray = new Tovar[5];

        productsArray[0] = new Tovar("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599.0, true);
        productsArray[1] = new Tovar("NOKIA", "10.10.2025", "BY", "Belarus", 40500.0, false);
        productsArray[2] = new Tovar("VITYAZ", "15.015.2015", "BY", "Belarus", 11200.0, true);
        productsArray[3] = new Tovar("T1000", "20.20.2020", "RU", "Moscow", 600200.0, false);
        productsArray[4] = new Tovar("POCCO 3D TURBO", "05.05.2026", "BY", "Belarus", 10000.0, false);

        System.out.println("ИНФОРМАЦИЯ О ВСЕХ ТОВАРАХ:");
        for (Tovar product : productsArray) {
            product.printInfo();
        }
    }
}