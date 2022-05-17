package day27_nested_loops;
import java.util.Scanner;
public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = input.next();
        String duplicate = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }if (count>1){
            if (!duplicate.contains(str.charAt(i) + "")) {
                duplicate += str.charAt(i);
            }

        } count = 0;

    }
        System.out.print("The duplicates :"+ duplicate);
        

    }}

