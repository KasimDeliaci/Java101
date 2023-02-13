package Java101;
import java.util.Scanner;


public class VucutIndex {
    public static void main(String[] args){
        double boy,kg,index;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu kg cinsinden giriniz: ");
        kg = input.nextDouble();

        index = kg / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + index);

    }
}
