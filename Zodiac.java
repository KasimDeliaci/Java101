package Java101;
import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args){
        int year,remainder;
        Scanner inp = new Scanner(System.in);
        System.out.print("LÜtfen doğum yılınızı giriniz: ");
        year = inp.nextInt();

        remainder = year%12;
        switch(remainder){
            case 0:
                System.out.println("Çin zodyak burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin zodyak burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin zodyak burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Çin zodyak burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin zodyak burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin zodyak burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Çin zodyak burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin zodyak burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Çin zodyak burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin zodyak burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Çin zodyak burcunuz: At");
                break;
            case 11:
                System.out.println("Çin zodyak burcunuz: Koyun");
                break;
        }




    }
}
