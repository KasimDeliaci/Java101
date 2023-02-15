package Java101;
import java.util.Scanner;

public class Sign {
    public static void main(String[] args){
        String month, sign = null;
        int day;
        Scanner inp = new Scanner (System.in);
        System.out.print("Lütfen doğduğunuz ayı girin: ");
        month = inp.nextLine();

        System.out.print("Lütfen doğduğunuz günü girin: ");
        day = inp.nextInt();

        if(month.equals("Ocak") || month.equals("ocak")){
            sign = (day >= 22) ? "Kova":"Oğlak";
        }
        else if(month.equals("Şubat") || month.equals("şubat")){
            sign = (day >= 20) ? "Balık":"Kova";
        }
        else if(month.equals("Mart") || month.equals("mart")){
            sign = (day >= 21) ? "Koç":"Balık";
        }
        else if(month.equals("Nisan") || month.equals("nisan")){
            sign = (day >= 21) ? "Boğa":"Koç";
        }
        else if(month.equals("Mayıs") || month.equals("mayıs")){
            sign = (day >= 22) ? "İkizler":"Boğa";
        }
        else if(month.equals("Haziran") || month.equals("haziran")){
            sign = (day >= 23) ? "Yengeç":"İkizler";
        }
        else if(month.equals("Temmuz") || month.equals("temmuz")){
            sign = (day >= 23) ? "Aslan":"Yengeç";
        }
        else if(month.equals("Ağustos") || month.equals("ağustos")){
            sign = (day >= 23) ? "Başak":"Aslan";
        }
        else if(month.equals("Eylül") || month.equals("eylül")){
            sign = (day >= 23) ? "Terazi":"Başak";
        }
        else if(month.equals("Ekim") || month.equals("ekim")){
            sign = (day >= 22) ? "Akrep":"Terazi";
        }
        else if(month.equals("Kasım") || month.equals("kasım")){
            sign = (day >= 22) ? "Yay":"Akrep";
        }
        else if(month.equals("Aralık") || month.equals("aralık")){
            sign = (day >= 22) ? "Oğlak":"Yay";
        }
        else{
            System.out.println("Yanlış bilgi! Lütfen kontrol edin ");
        }

        System.out.println("Burcunuz: " + sign);

    }
}


