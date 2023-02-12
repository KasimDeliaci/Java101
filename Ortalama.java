package Java101;
import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double mat,fizik,kimya,turkce,tarih,muzik;

        System.out.println("Matematik notunu giriniz: ");
        mat = inp.nextDouble();

        System.out.println("Fizik notunu giriniz: ");
        fizik = inp.nextDouble();

        System.out.println("Kimya notunu giriniz: ");
        kimya = inp.nextDouble();

        System.out.println("Türkçe notunu giriniz: ");
        turkce = inp.nextDouble();

        System.out.println("Tarih notunu giriniz: ");
        tarih = inp.nextDouble();

        System.out.println("Müzik notunu giriniz: ");
        muzik = inp.nextDouble();

        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;

        String sonuc = ortalama >=60 ? "Sınıfı Geçti!":"Sınıfta Kaldı!";
        System.out.println("Ortalamaniz: " + ortalama + "\nDurumu: " +sonuc);






    }
}
