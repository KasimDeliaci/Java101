package Java101;
import java.util.Scanner;

public class recursiveFibonacci {

    static int fibonacci(int n){

        if( n == 1 || n == 2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args){
        int num;
        Scanner input  = new Scanner(System.in);
        System.out.print("Lütfen kaçıncı elemanı bulmak istediğinizi girin : ");
        num = input.nextInt();
        System.out.print(fibonacci(num));

    }
}
