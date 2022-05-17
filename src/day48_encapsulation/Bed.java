package day48_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Bed {
 ArrayList<Pillow>pillows;
 public Bed(){
   pillows= new ArrayList<>();
 }


}
class Pillow {
  public static void main(String[] args) {
    Bed bed = new Bed();
    bed.pillows.add(new Pillow());
    bed.pillows.add(new Pillow());

    System.out.println(bed.pillows.size());

  }
}