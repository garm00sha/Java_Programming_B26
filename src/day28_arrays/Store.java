package day28_arrays;

public class Store {
    public static void main(String[] args) {
        String [] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};

        // Do we have jackets in stock?
        boolean hasJacket = false;
        for (int i = 0; i <items.length ; i++) {
            if(items[i].equalsIgnoreCase("jackets")){
                hasJacket = true;
                break;
            }else
                hasJacket = false;

        }

        System.out.println(hasJacket);




    }
}
