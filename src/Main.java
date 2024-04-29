public class Main {
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високостный");
        } else {
            System.out.println("Год " + year + " не является високостным");
        }
    }

    public static int checkOsYearPhone(int phoneOS, int phoneDeviceYear) {
        if (phoneOS == 0 && phoneDeviceYear >= 2024) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (phoneOS == 0 && phoneDeviceYear < 2024) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        }
        if (phoneOS == 1 && phoneDeviceYear >= 2024) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (phoneOS == 1 && phoneDeviceYear < 2024) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }
        return phoneOS;
    }

    public static void howManyDaysDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день для доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется два дня для доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется три дня для доставки");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        // Задание 1
        checkLeapYear(2560);
        // Задание 2
        checkOsYearPhone(1, 2028);
        // Задание 3
        howManyDaysDelivery(90);
    }
}