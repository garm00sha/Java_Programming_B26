package day08_03_09_2022;
import java.util.Scanner;
public class CamelCase {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string ");
        String str = input.nextLine();
        char ch =' ';
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                ch+=str.charAt(i);

            }

        }
        System.out.println(" "+ ch);

    }}
