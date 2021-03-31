import java.util.Scanner;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.
public class Task18 {
    public static void main(String [] args) {
        int n;
        int m;
        System.out.print("Вводите начало промежутка: ");
        Scanner sr = new Scanner(System.in);
        m = sr.nextInt();
        System.out.println("Введите конец промежутка: ");
        n = sr.nextInt();
        for (int j = m; j <= n; j++ ){
            System.out.print("\nЧисло " + j + " делится без остатка на: ");
            for (int i = 2; i < j; i++) {
                if ((j % i) == 0) {
                    System.out.print(i + " " );
                }
            }
        }
    }
}