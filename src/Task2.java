//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//(b+sqrt(b^2+4ac)/2a)-a^3c+b^(-2)
import java.util.Scanner;

public class Task2 {
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
        System.out.println((b +Math.sqrt(Math.pow(b,2)+4*a*c))/2/a -Math.pow(a, 3)*c + Math.pow(b, -2));
    }
}
