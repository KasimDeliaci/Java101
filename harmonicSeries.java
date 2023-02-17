package Java101;
import java.util.Scanner;

public class harmonicSeries {
    public static void main(String[]  args) {
        int num; double sum = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please entee the number: ");
        num = inp.nextInt();

        for(int i = 1; i <= num; i++){
            sum += 1.0 / i;
        }
        System.out.printf("Harmonic serie is: %.2f ", sum);

    }
}
