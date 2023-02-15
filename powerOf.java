package Java101;
import java.util.Scanner;

public class powerOf {
    public static void main(String[] args){
        int base,expo,total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        base = input.nextInt();
        System.out.print("Üssü giriniz: ");
        expo = input.nextInt();

        for(int i = 1; i<=expo; i++){
            total *= base;
        }
        System.out.print( base + " to the " + expo + " is: " + total);

    }
}
