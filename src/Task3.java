import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double x;
        double y;
        System.out.println("Введите x:");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        System.out.println("Введите y:");
        y = in.nextDouble();
        System.out.println((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));

    }
}

