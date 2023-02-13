package Java101;
import java.util.Scanner;

public class Daire {
    public static void main(String[] args){
        double pi = 3.14,r,alfa,cevre,alanTum,alanDilim;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçapı giriniz: ");
        r = input.nextDouble();
        System.out.print("Lütfen alanını bulmak istediğiniz dilimin açısını giriniz: ");
        alfa = input.nextDouble();
        cevre = 2*pi*r;
        alanTum = pi*r*r;
        alanDilim = alanTum*(alfa/360);

        System.out.println("Çevre: " + cevre + "\nAlan: " + alanTum + "\nDilimin Alanı: " + alanDilim);



    }
}
