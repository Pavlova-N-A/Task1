//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        double x1;
        double x2;
        double x3;
        double y1;
        double y2;
        double y3;
        System.out.println("Введите значения х1:");
        Scanner in = new Scanner(System.in);
        x1 = in.nextDouble();
        System.out.println("Введите значения у1:");
        y1 = in.nextDouble();
        System.out.println("Введите значения х2:");
        x2 = in.nextDouble();
        System.out.println("Введите значения у2:");
        y2 = in.nextDouble();
        System.out.println("Введите значения х3:");
        x3 = in.nextDouble();
        System.out.println("Введите значения у3:");
        y3 = in.nextDouble();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки находятся на разных прямых");
        }
    }
}
