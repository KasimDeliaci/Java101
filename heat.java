package Java101;
import java.util.Scanner;

public class heat {
    public static void main(String[] args){
        int temperature;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        temperature = input.nextInt();

        if(temperature < 5){
            System.out.print("Kayak yapabilirsiniz: ");
        }
        else if(temperature >= 5 && temperature <= 15){
            System.out.print("Sinemaya gidebilirsiniz: ");
        }
        else if(temperature >= 15 && temperature <= 25){
            System.out.print("Piknik yapabilirsiniz ");
        }
        else{
            System.out.print("Yüzmeye gidebilirsiniz ");
        }
    }
}
