//Составить программу нахождения произведения квадратов первых двухсот чисел.
import java.math.BigDecimal;
public class Task15{
    public static void main(String[] args) {

        int N = 200;

        int[] array = new int[N];

        for (int i = 1, k = 0; i <= N; i++, k++) {
            array[k] = i * i;
        }
        BigDecimal product = BigDecimal.ONE;
        for (int i = 1; i < N; i++) {
            product = product.multiply(BigDecimal.valueOf(array[i]).multiply(BigDecimal.valueOf(array[i - 1])));
        }
        System.out.println(product);
    }
}
