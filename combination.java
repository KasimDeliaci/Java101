package Java101;
import java.util.Scanner;

public class combination {
    public static void main(String[] args){
        System.out.println("Kombinasyon tanımı : N elemanlı bir kümenin elemanları" +
                " \n ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li " +
                "\n kombinasyonu olarak adlandırılır.\n");
        System.out.println("Kombinason formülü : C(n,r) = n! / (r! * (n-r)!)\n");

        int n,r, facn = 1, facr = 1, facnminr = 1 ,combination;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kombinasyonunu hesaplamak istediğiniz küme kaç elemanlı : ");
        n = inp.nextInt();

        System.out.print("Farklı grupların sayısı kaç elemanlı : ");
        r = inp.nextInt();

        for(int i = 1; i <= n; i++){
            facn *= i;
        }
        for(int j = 1; j <= r; j++){
            facr *= j;
        }
        for(int k = 1; k <= n-r; k++){
            facnminr *= k;
        }
        combination = facn / ( facr * facnminr);
        System.out.println("C("+ n +"," + r + ") = " + combination);

    }
}
