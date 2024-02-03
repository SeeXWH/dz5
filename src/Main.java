public class Main {
    public static void main(String[] args) {
        // task 1
        var clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // task 2
        var clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("становите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // task 3
        var year = 2021;
        if ((year > 1584) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");

        }
        // task 4
        var range = 30;
        if (range <= 20) {
            System.out.println("Одни сутки");
        } else if (range > 20 && range <= 60) {
            System.out.println("Двое суток");
        } else if (range > 60 && range <= 100) {
            System.out.println("Трое суток");
        } else {
            System.out.println("Доставки нет");
        }
        // task 5
        var monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}