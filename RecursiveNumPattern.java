package Java101;
import java.util.*;

public class RecursiveNumPattern {
    static void Pattern(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        Pattern(n - 5);

        System.out.print(n + " ");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter a number greater than 0 : ");
        int num = input.nextInt();
        Pattern(num);

    }
}
