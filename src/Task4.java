//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double x;
        System.out.println("Введите число х вида nnn.ddd:");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        double n = (int) x;
        double result = n / 1000 + (x - n) * 1000;
        System.out.println(result);
    }
}
