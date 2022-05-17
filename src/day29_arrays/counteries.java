package day29_arrays;

public class counteries {
    public static void main(String[] args) {
        String [] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States"};
        String initials = "";
        int count = 0;
        for (int i = 0; i < countries.length; i++) {

            initials += ""+countries[i].charAt(0) + countries[i].charAt(countries[i].length()-1) + ", ";
            count++;


        }
        System.out.println(initials);

        for (int i = 0; i < countries.length; i++) {

            if (countries[i].endsWith("a")){
                System.out.println(countries[i]+", ");
            }

        }

        for (int i = 0; i < countries.length; i++) {

            if (countries[i].contains("United States")){
                System.out.println("The Array contains " + countries[i]);
            }

        }




    }
}


