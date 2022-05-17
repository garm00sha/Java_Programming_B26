package day09_scanner;

public class EligibleToVote {

    /*
            create and assign these variables:

                name
                are they citizen
                do have criminal background
                age

            determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

         */
    public static void main(String[] args) {
        String name = "Anwar Daoud";
        boolean isCitizen = true;
        boolean hasCriminalBackgroun = false;
        int age = 38;
        boolean isEligibleToVote = age >= 18 && isCitizen && !hasCriminalBackgroun;
        System.out.println( name + " is eligible to vote " + isEligibleToVote);


    }
}
