package Java101;
import java.util.Scanner;

public class Hesap {
    public static void main(String[] args){
        int n1,n2,secim;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen işlem seçiniz: \n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        secim = input.nextInt();
        System.out.print("İLk sayiyi giriniz:");
        n1 = input.nextInt();
        System.out.print("İkini sayıyı giriniz: ");
        n2 = input.nextInt();
        switch(secim){
            case 1:
                System.out.println("Toplam: " + (n1+n2));
                break;
            case 2:
                System.out.println("Fark: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1*n2));
                break;
            case 4:
                if(n1 == 0 || n2 == 0){
                    System.out.println("0'a bölünemez!");
                break;
                }
                else
                    System.out.println("Bölüm: " + (n1/n2));
            default:
                System.out.println("Geçerli seçim yapın: 1-2-3-4");
        }

    }

}
