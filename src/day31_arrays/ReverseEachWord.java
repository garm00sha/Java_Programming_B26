package day31_arrays;
import java.util.Arrays;
public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "It started to snow in Chicago";

        String [] sentences = str.split(" ");

        System.out.println(Arrays.toString(sentences));

        for( String each : sentences){

            String reverse = "";

            for (int i = each.length()-1; i >= 0; i--) {

                reverse += each.charAt(i);

            }
            System.out.print(" " + reverse);
        }
    }
}
