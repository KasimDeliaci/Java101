package Java101;
import java.util.Scanner;

public class Ticket {
    public static void main(String[] args){
        double ageSale1 = 0.5, ageSale2 = 0.1, ageSale3 = 0.3, waySale = 0.2, perKm = 0.1,km,ticketPrice;
        int way,age;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi km cinsinden giriniz: ");
        km = input.nextDouble();

        System.out.print("LÜtfen yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Lütfen yolculuk tipini giriniz: 1 --> TEK YÖN 2 --> ÇİFT YÖN ");
        way = input.nextInt();

        ticketPrice = km*perKm;
        if(km > 0 && age > 0){
            switch(way){
                case 1:
                    if(age <= 12){
                        ticketPrice = ticketPrice*ageSale1;
                        System.out.println("Toplam Tutarınız: " + ticketPrice);
                        break;
                    }
                    else if(age > 12 && age <= 24){
                        ticketPrice = ticketPrice - (ticketPrice*ageSale2);
                        System.out.println("Toplam Tutarınız: " + ticketPrice);
                        break;
                    }
                    else if(age >= 65){
                        ticketPrice = ticketPrice - (ticketPrice*ageSale3);
                        System.out.println("Toplam Tutarınız: " + ticketPrice);
                        break;
                    }
                case 2:
                    if(age <= 12){
                        ticketPrice = ticketPrice - (ticketPrice*ageSale1);
                        ticketPrice = ticketPrice - (ticketPrice*waySale);
                        ticketPrice = 2 * ticketPrice;
                        System.out.println("Toplam Tutarınız: " + ticketPrice);
                        break;
                    }
                    else if(age > 12 && age <= 24){
                        ticketPrice = ticketPrice - (ticketPrice*ageSale2);
                        ticketPrice = ticketPrice - (ticketPrice*waySale);
                        ticketPrice = 2 * ticketPrice;
                        System.out.println("Toplam Tutarınız: " + ticketPrice);
                        break;
                    }
                    else if(age >= 65){
                        ticketPrice = ticketPrice - (ticketPrice*ageSale3);
                        ticketPrice = ticketPrice - (ticketPrice*waySale);
                        ticketPrice = 2 * ticketPrice;
                        System.out.println("Toplam Tutarınız: " + ticketPrice);
                        break;
                    }
                default:
                    System.out.println("Geçerli yol seçimi yapmadınız! ");
            }
        }
    else{
        System.out.println("Yaş ve KM değeri pozitif olmalı! ");
    }

    }
}
