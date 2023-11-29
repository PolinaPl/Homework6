public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является высокосным.");
        }
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача 8");
        int one = 29000;
        int totalYear = 0;
        for (int i = 1; i <= 12; i++) {
            totalYear = totalYear + one;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalYear + " рублей.");
        }
        System.out.println("Задача 9");
        int one1 = 29000;
        int totalYear1 = 0;
        for (int i = 1; i <= 12; i++) {
            totalYear1 = totalYear1 + totalYear1/100;
            totalYear1 = totalYear1 + one1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalYear1 + " рублей.");
        }
        System.out.println("Задача 10");
        for (int i = 1; i<=10; i++) {
            System.out.println("2 *" + i + " = " + i*2);
        }
    }
}