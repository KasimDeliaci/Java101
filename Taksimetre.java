package Java101;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){
        double kmBasi =2.20,tutar,km;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gidilecek mesafeyi km cinsinden giriniz: ");
        km = input.nextDouble();
        tutar = 10 + km * kmBasi;
        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Ücretiniz: " + tutar);

    }
}
