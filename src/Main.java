import java.util.Random;

public class Main {
    public static void main(String[] args) {
        writeLine();
        System.out.println("Задание 1");
        task1();
        writeLine();

        System.out.println("Задание 2");
        task2();
        writeLine();

        System.out.println("Задание 3");
        task3();
        writeLine();
    }

    public static int generateRandomNumber() {
        Random rand = new Random();
        int year = rand.nextInt(1764,2132);
        return year;
    }

    public static void writeLine() {
        System.out.println();
        System.out.println("=============================================================");
        System.out.println();

    }
    public static int generateRandomDateRelease() {
        Random rand = new Random();
        int releaseDate = rand.nextInt(2008,2023);
        return releaseDate;
    }

    public static int generateRandomNumberOS() {
        Random rand = new Random();
        int year = rand.nextInt(0,2);
        return year;
    }

    public static void task3() {
        var deliveryDistance = generateRandomNumberForTask3();
        var deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (20 > deliveryDistance || deliveryDistance <= 60){
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (60 > deliveryDistance || deliveryDistance <= 100) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }
    public static int generateRandomNumberForTask3() {
        Random rand = new Random();
        int distance = rand.nextInt(0,200);
        return distance;
    }

    public static void task2() {
        var OS = generateRandomNumberOS();
        var releaseDate = generateRandomDateRelease();
        if (OS == 1 && releaseDate > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (OS == 1 && releaseDate <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (OS == 0 && releaseDate <= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == 0 && releaseDate > 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        System.out.println(OS + " " + releaseDate + " <== версия и дата выхода для проверки кода");
    }

    public static void task1() {
        int year = generateRandomNumber();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год являеться високосным");
        } else if ((year % 4 == 0 && year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " год являеться високосным");
        } else {
            System.out.println(year + " год не являеться високосным");
        }
    }
}