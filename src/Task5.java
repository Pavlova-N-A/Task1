//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int secs;
        System.out.println("Введите число Т, которое представляет длительность прошедшего времени в секундах:");
        Scanner in = new Scanner(System.in);
        secs = in.nextInt();
        int hour = secs / 3600;
        int min = secs / 60%60;
        int sec = secs%60;
        System.out.println(hour + " ч  " + min + " мин  " + sec + " c  ");
    }
}
