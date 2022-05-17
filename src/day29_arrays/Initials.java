package day29_arrays;
import java.util.Arrays;
import java.util.Locale;

public class Initials {
    public static void main(String[] args) {
        String [] names = {"James Bond", "Eva Rell", "Anna Johnson"};
        String initial ="";

        for (int i = 0; i < names.length ; i++) {
            initial=names[i].toUpperCase();
            System.out.println("" + initial.charAt(0) + initial.charAt(initial.indexOf(" ") + 1));

        }
    }
}
