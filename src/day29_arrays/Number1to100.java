package day29_arrays;

import java.util.Arrays;

public class Number1to100 {
    public static void main(String[] args) {
        int [] numbers = new int[100];
        int num = numbers[0];
        for (int i = 0; i <=99 ; i++) {
            numbers[i] = i+1;

        } System.out.print(Arrays.toString(numbers));
    }
}
