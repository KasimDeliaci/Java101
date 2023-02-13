package Java101;
import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args){
        int dik1,dik2;
        double hipo,u,alan;
        System.out.print("ilk kenarı giriniz: ");
        Scanner input = new Scanner(System.in);
        dik1 = input.nextInt();

        System.out.print("ikini kenarı giriniz: ");
        dik2 = input.nextInt();
        hipo = Math.sqrt(dik1*dik1 + dik2*dik2);
        u = (dik2 + dik1 + hipo)/2.0;
        alan = Math.sqrt(u*(u-dik1)*(u-dik2)*(u-hipo));

        System.out.println("Hipotenüs: " + hipo + "\nAlan: " + alan);
    }

}
