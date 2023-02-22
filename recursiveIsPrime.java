package Java101;
import java.util.Scanner;

public class recursiveIsPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;  // 1 and below are not prime
        } else if (n <= 3) {
            return true;  // 2 and 3 are prime
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;  // multiples of 2 or 3 are not prime
        } else {
            // Check whether n is divisible
            for (int i = 5; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        num = input.nextInt();
        if(isPrime(num)){
            System.out.printf("%d is prime! ",num);
        }
        else{
            System.out.printf("%d is NOT prime! ",num);
        }


    }
}
