package day04_variables;
/* Task:

    class name: School

declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    average gpa in school
print all of the variables with unique messages*/

public class School {

    public static void main(String[] args) {
        int numberOfStudentInGrade1 = 150;
        int numberOfStudentInGrade2 = 160;
        int numberOfStudentInGrade3 = 170;
        int numberOfStudentInGrade4 = 175;
        int numberOfStudentInGrade5 = 180;
        int numberOfStudents = numberOfStudentInGrade1 + numberOfStudentInGrade2 + numberOfStudentInGrade3 +numberOfStudentInGrade4 + numberOfStudentInGrade5;

        double numberOfDaysInYear = 150.5;
        double numberSnowDays = 5.5;
        double avarageGpaInSchool = 3.6;

        System.out.println("numberOfStudentInGrade1 = " + numberOfStudentInGrade1);
        System.out.println("numberOfStudentInGrade2 = " + numberOfStudentInGrade2);
        System.out.println("numberOfStudentInGrade3 = " + numberOfStudentInGrade3);
        System.out.println("numberOfStudentInGrade4 = " + numberOfStudentInGrade4);
        System.out.println("numberOfStudentInGrade5 = " + numberOfStudentInGrade5);
        System.out.println();
    }
}
