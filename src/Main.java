//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("***** Задача № 1 ******");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("***** Задача № 2 ******");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("***** Задача № 3 ******");
        for (int j = 1; j <= 17; j++) {
            if (j % 2 == 0) { // Проверяем, что число четное
                System.out.println(j);
            }
        }
        System.out.println("***** Задача 4: Вывод чисел от 10 до -10 ******");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("***** Задача № 5 ******");
//Вывести  все високосные года, начиная с 1904 года до 2096.

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("***** Задача № 6 *****");

        for (int i = 0; i <= 98; i = i + 7) {
            if (i != 0) {
                System.out.println(i);
            }
        }

        System.out.println("***** Задача № 7 ******");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        System.out.println("***** Задача № 8 ******");
        int sum = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + sum;
            System.out.println("Месяц" + i + ", сумма накоплений равна: " + total + " рублей");
        }

        System.out.println("***** Задача № 9 ******");

        float sum1 = 29000; // Сумма, добавляемая каждый месяц
        float total1 = 0;   // Общая сумма накоплений
        float rate = (float) (0.12 / 12); // Месячная процентная ставка

        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1 * rate; // Начисляем проценты
            total1 = total1 + sum1; // Добавляем сумму за месяц
            System.out.println("Месяц " + i + ", сумма накоплений равна: " + total1 + " рублей");
        }
        System.out.println("***** Задача № 10 ******");

        int sum2 = 2; // Число, на которое умножаем
        int total2 = 0; // Результат умножения (и накопления суммы)

        for (int i = 0; i <= 10; i++) {
            total2 = sum2 * i; // Вычисляем результат умножения
            System.out.println(sum2 + "*" + i + "=" + total2); // Выводим результат
        }
    }
}