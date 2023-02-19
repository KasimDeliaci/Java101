package Java101;
import java.util.Scanner;

public class minOrMax {
    public static void main(String[] args){
        int inp, num,  max = 0, min = 0, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        num = input.nextInt();

        while(i <= num){
             System.out.printf(" %d. sayıyı giriniz: ",i);
             inp = input.nextInt();
             if(i == 1){
                 max = inp;
                 min = inp;

             }
             if(max < inp){
                 max = inp;
             }
            if(min > inp){
                min = inp;

            }

        i++;
        }
        System.out.println(" En büyük sayı : " + max);
        System.out.println(" En küçük sayı : " + min);
    }
}
