package Java101;
import java.util.Scanner;

public class CarryYear {
    public static void main(String[] args){
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz: ");
        year = input.nextInt();

        if(year%400 == 0){
            System.out.println(year + " artık yıl!");
        }
        else if(year%100 == 0 && year%400 != 0){
            System.out.println(year + " artık yıl değil!");
        }
        else if(year%4 == 0){
            System.out.println(year + " artık yıl!");
        }
        else{
            System.out.println(year + " artık yıl değil!");
        }

    }
}
