package Java101;
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        int num, quotient, numOfDigits = 0, sumOfDigits = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir sayı giriniz: ");
        num = input.nextInt();

        quotient = num;
        while(num > 0 && quotient != 0){
            sumOfDigits += quotient % 10;
            quotient = quotient / 10;
            numOfDigits++;
        }
        System.out.println("Sum of digits: " + sumOfDigits);


    }
}
