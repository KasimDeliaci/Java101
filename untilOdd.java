package Java101;
import java.util.Scanner;
public class untilOdd {
    public static void main(String[] args){
        int num,sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Lütfen sayı giriniz: ");
            num = input.nextInt();
            if( num % 4 == 0){
                sum += num;
            }

        }while (num % 2 == 0);
        System.out.println("Toplam: " + sum);
    }
}
