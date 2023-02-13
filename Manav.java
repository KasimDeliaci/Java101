package Java101;
import java.util.Scanner;

public class Manav {
    public static void main(String[] args){
        double kgarmut = 2.14, kgelma = 3.67, kgdomates = 1.11, kgmuz = 0.95, kgpatlican = 5.00;
        double armut,elma,domates,muz,patlican,tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo elma aldınız? ");
        elma = input.nextDouble();
        System.out.print("Kaç kilo armut aldınız? ");
        armut = input.nextDouble();
        System.out.print("Kaç kilo domates aldınız? ");
        domates = input.nextDouble();
        System.out.print("Kaç kilo muz aldınız? ");
        muz = input.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız? ");
        patlican = input.nextDouble();

        tutar = elma*kgelma + armut*kgarmut + domates*kgdomates + muz*kgmuz + patlican*kgpatlican;
        System.out.print("Sepet Tutarınız: " + tutar);


    }
}




