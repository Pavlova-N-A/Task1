//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид: An = 1/2^n + 1/3^n
public class Task16 {
    public static void main(String[] args) {

        double sum = 0.0;
        double e = 0.3;
        double an;
        int n = 50;

        for (int i = 2; i <= n; i++) {
            an = Math.pow(-1, i - 1) / i;
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }

        System.out.println("Сумма равна " + sum);
        System.out.println();
    }
}
