//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        System.out.println("Введите a:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        System.out.println("Введите b:");
        b = in.nextDouble();
        System.out.println("Введите c:");
        c = in.nextDouble();
        System.out.println(((a - 3)*b/2) + c);
    }
}
