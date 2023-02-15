package Java101;
import java.util.Scanner;

public class cmpr {
    public static void main(String[] args){
        int x, y, z;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        x = inp.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        y = inp.nextInt();

        System.out.print("Lütfen son sayıyı giriniz: ");
        z = inp.nextInt();

        if(x > y && x > z){
            if(y > z){
                System.out.print(x + ">" + y + ">" + z);
            }
            else{
                System.out.print(x + ">" + y + ">" + z);
            }

        }
        else if(y > x && y > z){
            if(x > z){
                System.out.print(y + ">" + x + ">" + z);
            }
            else{
                System.out.print(y + ">" + z + ">" + x);
            }

        }
        else if(z > x && z > y){
            if(x > y){
                System.out.print(z + ">" + x + ">" + y);
            }
            else{
                System.out.print(z + ">" + y + ">" + x);
            }

        }
    }

}
