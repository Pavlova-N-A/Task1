//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int x;
        System.out.println("Введите любое целое положительное число:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        int sum = 0;
        for (int a = 1; a <= x; a++) {

            sum = sum + a;

        }
        System.out.println("Сумма всех чисел от 1 до введённого вами числа: " + sum);
    }
}
