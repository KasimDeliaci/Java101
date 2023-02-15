package Java101;
import java.util.Scanner;

public class untilEven {
    public static void main(String[] args){
        int num,sum = 0;
        double avg,count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if(i % 3 == 0 || i % 4 == 0){
                count++;
                sum += i;
                System.out.println(i);
            }
        }
        avg = sum/count;
        System.out.println("3 veya 4'e bölünenlerin rtalaması: " + avg);
    }
}
