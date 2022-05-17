package day31_arrays;
import java.util.Arrays;
public class URLparts {
    public static void main(String[] args) {

        String url = "https://learn.cydeo.com/courses/130";
        String [] arr = url.split("/");

        for (String each : arr) {
            System.out.println(each);
        }
    }

}
