import java.time.LocalDate;

public class Main {

    // Task 1
    public static void printIsLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printIsleapYear(year, leapYear);
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsleapYear(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год является не високосным.");
        }
    }

    // Task 2

    String osName = "iOS";
    int clientOS = getClientOS(osName);


    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void calculationYearOC(int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0  && currentYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void calculationDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20){
            System.out.println("Потребуется 1 день");
        }else if (deliveryDistance > 20 && deliveryDistance <= 60 ) {
            System.out.println("Потребуется 2 дня");
        }else if (deliveryDistance > 60 && deliveryDistance <=100 ) {
            System.out.println("Потребуется 3 дня");
        }
    }

    public static void main (String[]args){
        System.out.println(" Task 1 ");
        printIsLeapYear(2020);
        System.out.println(" Task 2 ");
        calculationYearOC(0);
        System.out.println(" Task 3 ");
        calculationDelivery(55);

    }

}