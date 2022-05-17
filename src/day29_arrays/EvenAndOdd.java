package day29_arrays;
import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers your array have");
        int num = input.nextInt();
        int [] numbers = new int[num];
        int even = 0;
        int odd = 0;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter number");
            numbers[i] = input.nextInt();
            if (numbers[i] % 2 == 0 ){
                even++;

            }else if(numbers[i] % 2 == 1){
                odd++;
            }
        }
        System.out.println("Even: "+ even);
        System.out.println("Odd : "+odd);
    }
}
