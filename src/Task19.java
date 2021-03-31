//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();
        int[] arr = new int[10];
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.println("Цифры входящие в запись как первого, так и второго числа: " + b % 10);
            b /= 10;
        }
    }
}
