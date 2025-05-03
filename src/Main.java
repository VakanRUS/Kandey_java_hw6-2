import java.time.LocalDate;

class Homework {
    public static void main(String[] args) { // Метод main
        //task 1
        System.out.println("task 1");
        int year = 2005;
        checkLeapYear(year);
        System.out.println();

        //task 2
        System.out.println("task 2");
        int currentYear = LocalDate.now().getYear();
        int osType = 0;
        checkOsVersion(osType, currentYear);
        System.out.println();

        //task 3
        System.out.println("task 3");
        int deliveryDistance = 95;
        if (calculateDeliveryDays(deliveryDistance) > 0) {
            System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
    }

    public static void checkLeapYear(int year) {
        if (year > 1584 && ((year % 100 > 0 && year % 4 == 0) || year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else if (year < 1584) {
            System.out.println("Тогда не было понятия високосных годов");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkOsVersion(int os, int year) {
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

    public static int calculateDeliveryDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance > 20 && distance < 60) {
            return 2;
        } else if (distance > 60 && distance < 100) {
            return 3;
        } else {
            return 0;
        }

    }
}