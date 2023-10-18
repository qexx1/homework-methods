import java.util.Random;

public class Main {
    public static void main(String[] args) {
        writeLine();
        System.out.println("Задание 1");
        madeMethodTask1(generateRandomNumber(1904));
        writeLine();

        System.out.println("Задание 2");
        madeMethodTask2(generateRandomNumberOS(0),generateRandomDateRelease(2008));
        writeLine();

        System.out.println("Задание 3");
        madeMethodTask3(generateRandomNumberForTask3(65));
        writeLine();
    }

    public static int generateRandomNumber(int year) {
        return year;
    }

    public static void writeLine() {
        System.out.println();
        System.out.println("=============================================================");
        System.out.println();

    }
    public static int generateRandomDateRelease(int releaseDate) {
        return releaseDate;
    }

    public static int generateRandomNumberOS(int OS) {
        return OS;
    }

    public static void madeMethodTask3(int deliveryDistance) {
        deliveryDistance = generateRandomNumberForTask3(deliveryDistance);
        int deliveryDay = 1;
        if (deliveryDistance <= 20 && deliveryDistance > 0) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (20 < deliveryDistance && deliveryDistance <= 60){
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        System.out.println(deliveryDistance + " <== для проверки");
    }
    public static int generateRandomNumberForTask3(int distance) {
        return distance;
    }

    public static void madeMethodTask2(int OS, int releaseDate) {
        OS = generateRandomNumberOS(OS);
        releaseDate = generateRandomDateRelease(releaseDate);
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

    public static void printMessageIfYearLeap(int year) {
        year = generateRandomNumber(year);
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год являеться високосным");
        } else if ((year % 4 == 0 && year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " год являеться високосным");
        } else {
            System.out.println(year + " год не являеться високосным");
        }
    }
}