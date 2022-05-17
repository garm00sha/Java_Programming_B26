package day29_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class AverageNumber {
    public static void main(String[] args) {



                //DO NOT TOUCH BELOW:
                Scanner input = new Scanner(System.in);
                int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

                //WRITE YOUR CODE BELOW:
                int count = 0;

                for(int i=0 ; i < nums.length ; i++){
                    if(nums[i] % 2 == 0){
                        count++;
                    }
                }
                System.out.println( count);
            }
        }




