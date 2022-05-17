package day25_recap;
import java.util.Scanner;
public class CreateID {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
    String firstName = input.next().toLowerCase();
        System.out.println("Enter your last name: ");
    String lastName = input.next().toUpperCase();



    char ch = lastName.charAt(0);

    char ch1 = firstName.charAt(0); //to stop on the 1st letter

    String last = lastName.substring(1,3);

    String last1 = last.toLowerCase();

    int num = firstName.length() * 2;

    String id = "" + ch1 + ch + last1 + num;

        System.out.println("id: " + id );
}}
/*
Saim works:-

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next().toLowerCase().trim();
        System.out.println("Enter your last name");
        String lastName = input.next().toLowerCase().trim();

        String id = firstName.substring(0, 1);
        id += lastName.substring(0,1).toUpperCase() + lastName.substring(1, 3);
        id += firstName.length() * 2;

        System.out.println(id); */