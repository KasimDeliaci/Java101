package Java101;
import java.util.Scanner;

public class upsideDownTriangle {
    public static void main(String[] args){
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen basamak sayısını giriniz : ");
        num = inp.nextInt();

        for(int i = num; i > 0; i--){
            for(int k = 0; k < num - i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }
}
/*
*******        7yildiz 0 bosluk 1.basamak(i)
 *****         5yildiz 1 bosluk 2.basamak
  ***          3 yildiz 2 bosluk 3.basamak
   *           1 yildiz 3 bosluk 4.basamak */