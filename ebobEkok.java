package Java101;
import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args){
        int num1, num2, ebob = 1, ekok = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("Lütfen ikini sayıyı giriniz: ");
        num2 = input.nextInt();

        if(num1 > num2){    // ebob bulan kısım
            int i = num1;
            while(i >= 1){
                if(num1 % i == 0 && num2 % i == 0){
                    ebob = i;
                    break;
                }
                i--;
            }
        }
        else{
            int i = num2;
            while(i >= 1){
                if(num1 % i == 0 && num2 % i == 0){
                    ebob = i;
                    break;
                }
                i--;
            }

        }
        System.out.println("EBOB: " + ebob);
        int i = 1;
        while( i  <= num2 * num1){
            if(i % num1 == 0 && i % num2 == 0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.print("EKOK: " + ekok);
    }
}
