package day29_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        int num = input.nextInt();
        int []Original = new int[num];
        int []reverse = new int[num];
        int count = 0;
        int count1 = 0;

        for (int i = 0; i <Original.length ; i++) {
            System.out.println("Enter number");
            Original[i] = input.nextInt();
            count1++;
        }

        for(int j=Original.length-1;j>=0;j--){
            reverse[count] = Original[j];
            count++;

    }System.out.println(Arrays.toString(reverse) );
}

    }
