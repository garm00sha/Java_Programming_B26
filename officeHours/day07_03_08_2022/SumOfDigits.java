package day07_03_08_2022;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string");
        String str = input.nextLine();
        char sum ='0';

        for (int i = 0; i <str.length() ; i++) {
            str.charAt(i);
            if(str.charAt(i) == '0' || str.charAt(i) == '1'||str.charAt(i) == '2'||str.charAt(i) == '3'||str.charAt(i) == '4'||str.charAt(i) == '5'|| str.charAt(i) == '6'||
            str.charAt(i) == '7' ||str.charAt(i) == '8'||str.charAt(i) == '9') {
                sum +=str.charAt(i);
            }

        }
        System.out.println(sum);
    }

}
