package day15_switch;
import java.util.Scanner;
public class Days {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Which day you want to check the schedule for");
        String day = input.nextLine();
        switch (day){
            case "Monday":case "monday":
                System.out.println("java class from 7-10 pm and no office hours");
                break;
            case "Tuesday":case "tuesday":
            case "Wednesday": case "wednesday":
                System.out.println("java class from 7-10 pm and  office hours 5-6");
                break;

            case "Thursday":case "thursday":
                System.out.println("Soft skills class from 7-10 pm and NO office hours ");
                break;
            case "Friday":case "friday":
                System.out.println("Break and review");
                break;
            case "Saturday":case "saturday":
            case "Sunday":case "sunday":
                System.out.println("Java class from 10-5 and NO office hours ");
                break;

            default:
                System.out.println("Not valid day");

        }






    }






}
