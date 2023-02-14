package Java101;
import java.util.Scanner;

public class GectiKaldi {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double mat,fizik,kimya,turkce,muzik,minPass = 55.0;
        double valMat,valFizik,valKimya,valTurkce,valMuzik, ort;

        System.out.println("Matematik notunu giriniz: ");
        mat = inp.nextDouble();

        System.out.println("Fizik notunu giriniz: ");
        fizik = inp.nextDouble();

        System.out.println("Kimya notunu giriniz: ");
        kimya = inp.nextDouble();

        System.out.println("Türkçe notunu giriniz: ");
        turkce = inp.nextDouble();

        System.out.println("Müzik notunu giriniz: ");
        muzik = inp.nextDouble();

        valMat = (mat>=0 && mat<=100) ? mat:0;
        valFizik = (fizik>=0 && fizik<=100) ? fizik:0;
        valKimya = (kimya>=0 && kimya<=100) ? kimya:0;
        valTurkce = (turkce>=0 && turkce<=100) ? turkce:0;
        valMuzik = (muzik>=0 && muzik<=100) ? muzik:0;
        ort = (valMat+valKimya+valFizik+valTurkce+valMuzik)/5.0;
        if(ort>=55){
            System.out.println("Tebrikler sınıfı geçtiniz! ");
        }
        else{
            System.out.print("Kaldınız, sınıf tekraı ");
        }

    }

}



