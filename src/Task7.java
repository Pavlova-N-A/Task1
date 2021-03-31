import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double a; //Первый угол (в градусах)
        double b; //Второй угол (в градусах)
        double c; //Третий угол (в градусах)
        System.out.println("Введите значение a (в градусах):");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        System.out.println("Введите значение b  (в градусах):");
        b = in.nextDouble();
        c = 180 - a - b;
        if(a + b + c <= 180){

            System.out.println("Данный треугольник существует");
        } else {
            System.out.println("Данного треугольника не существует");
        }
        if ( (a == 90) || (b == 90) || (c == 90)){
            System.out.println("Треугольник прямоугольный");
        }
    }
}
