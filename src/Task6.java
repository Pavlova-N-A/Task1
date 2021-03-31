//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double x;
        double y;
        System.out.println("Введите x:");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        System.out.println("Введите y:");
        y = in.nextDouble();
        if(((x >= -2)&&(x <= 2)&&(y >= 0)&&(y <= 4)||(x >= -4)&&(x <= 4)&&(y >= -3)&&(y <= 0))){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
