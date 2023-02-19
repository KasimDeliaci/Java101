package Java101;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisinin ilk kaç elemanını istiyorsunuz : ");
        num = inp.nextInt();
         int first = 0, second = 1;
        for(int i = 0; i < num; i++){
            int fibo;
            fibo = first + second;
            first = second;
            second = fibo;
            System.out.print(" " + second);
        }
    }
}
