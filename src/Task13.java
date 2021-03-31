//Вычислить значения функции на отрезке [а,b] c шагом h:
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        double a, b, x, y, h;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало отрезка: ");
        a = in.nextInt();
        System.out.println("Введите конец отрезка: ");
        b = in.nextInt();
        System.out.println("Введите шаг h: ");
        h = in.nextDouble();

        for(x = a; x <= b; x += h){
            if(x <= 2){
                y = -x;
                System.out.println(y);
            } else {
                y = x;
                System.out.println(y);
            }
        }
    }
}
