package day29_arrays;
import java.util.Arrays;
public class MoveZero {
    public static void main(String[] args) {
        int [] numbers = {10, 0, 5, 0, 1, 0};
        int [] moveZero = new int[numbers.length];
        int count= 0;
        for (int i = 0; i < numbers.length ; i++) {

            if(numbers[i] != 0){
                moveZero[count]= numbers[i];
                count++;

        }

    }
        System.out.println(Arrays.toString(moveZero));
}}

