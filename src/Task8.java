//Найти max{min(a, b), min(c, d)}.
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        System.out.println("Введите значение переменных a, b");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        int min = Math.min (a, b);
        System.out.println("Введите значение переменных c, d:");
        c = in.nextInt();
        d = in.nextInt();
        int min1 = Math.min (c, d);
        int max = Math.max( min, min1);
        System.out.println("Максимальное значение: \t" + max);
    }
}
