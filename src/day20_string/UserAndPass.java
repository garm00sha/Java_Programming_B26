package day20_string;
import java.util.Scanner;
/*
create a class UserAndPass
ask the user to enter a username and password. Check if they are valid based on the following requirements:

- The password cannot be less than 5 characters
	If it is less print: "Password cannot be less than 5 characters"
	If it is more than or equal to 5 print: "Valid password"

- Also, the password should not contain the username
	If the password has the username in it print: "Invalid password, username should not be in it" and in that case change the password to have the value: "password"

Print the information in the end
 */
public class UserAndPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = input.nextLine();
        System.out.println("Enter password");
        String password = input.nextLine();

        if(password.length() >= 5 && !password.contains(userName)) {
            System.out.println("Valid password");
            System.out.println("Your information : ");
            System.out.println("Username : "+ userName);
            System.out.println("Password : "+ password);
        }else if(password.length() >= 5 && password.contains(userName)) {
            System.out.println("Invalid password, username should not be in it");
        }else if (password.length() < 5){
            System.out.println("Password cannot be less than 5 characters");
        }


        }







    }

