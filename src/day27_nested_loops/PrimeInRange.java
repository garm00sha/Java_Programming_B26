package day27_nested_loops;
import java.util.Scanner;
public class PrimeInRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        boolean isPrime = number >0;
        String str = "";
        for(int i = 2; i <= number; i++){
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
            }
            }
         if (isPrime){
            str+=i + ", ";
        }

        } System.out.print(str);
    }}
