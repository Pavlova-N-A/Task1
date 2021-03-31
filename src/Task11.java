//Вычислить значение функции
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        double x;
        System.out.println("Введите значение х:");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        if (x <= 3){
            System.out.println(x*x - 3*x + 9);
        } else{
            System.out.println(1 / (Math.pow(x, 3) + 6));
        }
    }
}
