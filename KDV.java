package Java101;
import java.util.Scanner;

public class KDV {
    public static void main(String[] args){
        double fiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen ürünün fiyatını giriniz: ");
        fiyat = input.nextDouble();
        double kdv = fiyat*18/100.0;
        double sonFiyat = fiyat*118/100;

        System.out.println("Ürünün Vergili Fyatı: "+ sonFiyat + "\nKDV Tutarı: "+kdv);



    }
}
