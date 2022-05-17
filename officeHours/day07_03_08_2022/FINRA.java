package day07_03_08_2022;
import java.util.Scanner;
public class FINRA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {

            if(i % 5 == 0 && i % 3 == 0 ) {

                System.out.print("FINRA ");

            }
            if (i % 3 == 0 && i % 5 != 0){
                System.out.print("FIN ");

            } else if(i % 5 == 0 && i % 3 != 0) {
                System.out.print("RA ");
            } else{
                    System.out.print(i + " ");


            }


        }
    }
}
