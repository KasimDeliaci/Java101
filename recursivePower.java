package Java101;
import java.util.Scanner;

public class recursivePower {

    static int power(int base, int expo) {
        if (expo == 0) {
            return 1;
        } else if (expo == 1) {
            return base;
        } else {
            return base * power(base, expo - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı giriniz : ");
        int base = input.nextInt();
        System.out.print("Üssü giriniz : ");
        int expo = input.nextInt();
        System.out.print(power(base, expo));
    }
}

