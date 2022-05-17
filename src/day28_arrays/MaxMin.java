package day28_arrays;

public class MaxMin {
     /*

        declare and assign an array

        500, 120, -80, 90, 250, - 10

        find the biggest number in the array

        find the smallest number in the array

     */
     public static void main(String[] args) {
         int [] numbers = {500, 120, -80, 90, 250, - 10};
         int Max = numbers[0];
         int Min = numbers[0];
         for (int i = 0; i <numbers.length ; i++) {
             if (numbers[i]>= Max){
                 Max = numbers[i];
             } else if (numbers[i]<= Min){
                 Min = numbers[i];

             }


         }System.out.println("max is "+ Max);
         System.out.println("min is "+Min);
     }
}
