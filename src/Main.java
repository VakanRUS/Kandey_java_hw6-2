class Homework {
    public static void main(String[] args) { // Метод main
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("task 1");
        int year = 2005;
        leapYear(year);
        System.out.println();
    }

    public static void task2() {
        System.out.println("task 2");
        int currentYear = 2022;
        String osName = "Android";
        osVersion(osNumber(osName), currentYear);
        System.out.println();
    }

    public static void task3() {
        System.out.println("task 3");
        int deliveryDistance = 95;
        if (typeOfDelivery(deliveryDistance) > 0) {
            System.out.println("Потребуется дней: " + typeOfDelivery(deliveryDistance));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
    }

    public static void leapYear(int year) {
        if (year > 1584 && ((year % 100 > 0 && year % 4 == 0) || year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else if (year < 1584) {
            System.out.println("Тогда не было понятия високосных годов");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void osVersion(int os, int year) {
        if (os == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1 && year >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (os == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && year >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else System.out.println("Неизвестный тип операционной системы");
    }

    public static int osNumber(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else if (name.equals("Android")) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int typeOfDelivery(int distance) {
        if (distance < 20) {
            return  1;
        } else if (distance > 20 && distance < 60) {
            return  2;
        } else if (distance > 60 && distance < 100) {
            return  3;
        } else {
            return 0;
        }

    }
}