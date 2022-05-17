package day05_variables;

public class EmployeeInfo {
    /* create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are the fulltime, job title, salary, number of pto, are they married, suite(char - A, B, C, D)

    Print all the variables*/
    public static void main(String[] args) {
        String firstName = "Saeeda";
        String lastName = "Daoud";
        char gender = 'F';
        int age = 39;
        String companyName = "Google";
        boolean isFullTime = true;
        String jobTitle = "Developer";
        double salary = 250_000;
        int numberOfPTO = 20;
        boolean isMarried = true;
        char suite = 'A';
        String fullDetails = "Employment information for " + firstName + " " + lastName + "\n" + jobTitle + " at " + companyName + " currently " + age + " years old.\n" +companyName + " is located in suite " + suite + ". This years salary comes to $" + salary + "\n Other details: PTO: " + numberOfPTO + ", full time? " + isFullTime + ", married? " + isMarried;

        System.out.println(fullDetails);



    }
}


