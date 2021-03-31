//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double A;
        double B;
        double x;
        double y;
        double z;
        System.out.println("Введите значения A:");
        Scanner in = new Scanner(System.in);
        A = in.nextDouble();
        System.out.println("Введите значения B:");
        B = in.nextDouble();
        System.out.println("Введите значения x:");
        x = in.nextDouble();
        System.out.println("Введите значения y:");
        y = in.nextDouble();
        System.out.println("Введите значения z:");
        z = in.nextDouble();
        if (x <= A && y <= B || y <= A && x <= B || x <= A && z <= B || z <= A && x <= B || z <= A && y <= B || y <= A && z <= B){
            System.out.println("Кирпич проходит через отверстие.");
        } else {
            System.out.println("Кирпич не проходит через отверстие.");
        }
    }
}
