package Java101;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        int n,m;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        n = inp.nextInt();

        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= n-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i - 1); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        m = n -1;
        for(; m > 0; m--){
            for(int k = 1; k <= n - m; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * m - 1); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

/*

 *****         1 bosluk 5 yildiz  0.     3
  ***          2 bosluk 3 yildiz   1.     2
   *           3 bosluk 1 yildiz     2.    1       n 3
n-i adet bosluk
2i + 1  yildiz */