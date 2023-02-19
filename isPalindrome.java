package Java101;
import java.util.Scanner;

public class isPalindrome {
    static boolean isPolindrome(int x){
        int  originalNumber = x, lastDigit, reversedNumber = 0;
        while( x != 0){
            lastDigit = x % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            x = x / 10;

        }
        if(reversedNumber == originalNumber){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){

        int num ;
        Scanner input  = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        num = input.nextInt();
        boolean result = isPolindrome(num);
        System.out.print(result);


    }
}
