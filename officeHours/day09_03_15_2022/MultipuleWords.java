package day09_03_15_2022;
import java.util.Arrays;
public class MultipuleWords {
    public static void main(String[] args) {
          String [] words = {"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can", "fridge", "dish washer"};


        for (int i = 0; i < words.length; i++) {

            if (words[i].contains(" ")){
                System.out.println(words[i]);
            }

        }



    }
}
