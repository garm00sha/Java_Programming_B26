package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "Iphone 11 pro max";
        String color = " green";
        double price = 1500.60;
        int storage = 512;
        boolean hasCamera = true;
        char sim = 'A';
        System.out.println("I have " + model + " from " + brand  );
        System.out.println("It come in the color "+ color + " and it has " + storage + " GB");
        System.out.println("For SIM type " + sim + " with a camera " + hasCamera + " the total price was $" + price);

    }
}
