package Java101;
import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args){
        int num, i = 1, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        num = input.nextInt();

        while(i <= num){
            if( num % i == 0 && i != num){
                sum += i;
            }
            i++;
        }
        if(sum == num){
            System.out.printf("%d bir mükemmel sayı!", num);
        }
        else{
            System.out.printf("%d bir mükemmel sayı değil!", num);

        }
    }
}


