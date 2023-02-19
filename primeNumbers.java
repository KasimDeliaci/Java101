package Java101;

public class primeNumbers {
    public static void main(String[] args){
        int numOfDivider = 0;
        for(int i = 2; i < 100; i++){
            for(int j = 1; j < i; j++){
                if( i % j == 0){
                   numOfDivider++;
                }

            }
            if(numOfDivider < 2){
                System.out.print(" " + i);
            }
            numOfDivider = 0;

        }


    }

}
