package day30_arrays;
import java.util.Arrays;
public class CharArray {
    public static void main(String[] args) {
        char [] letters = { 'j', 'a', 'v', 'a'};

        String word = "java";

        // converting a String to a char []

        char [] java = word.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

        // System.out.println(letters); // String work with char [] internally so the char [] is able to be printed as the String

        // print every letter in my String

        for(char eachChar : java){  //  for(char eachChar : word.toCharArray()){
            System.out.println(eachChar);
        }

        System.out.println(java[0]);
    }
}
