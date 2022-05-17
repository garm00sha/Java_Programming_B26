package day31_arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String[] words = {"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can", "fridge", "dish washer"};


        for (int i = 0; i < words.length; i++) {

            if (words[i].contains(" ")) {
                System.out.println(words[i]);
            }
        }
    }}