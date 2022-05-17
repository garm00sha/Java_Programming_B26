package day42_custom_classes;
/*Create a class Rectangle

create instance variables:
        base, height, perimeter, area

        create instance methods:

        - toString(): [return String]
        returns all the information of the Rectangle objects, including the perimeter and area

        - calculatePerimeter(): [void]
        calculate the perimeter and store the result into the perimeter instance variable

        a perimeter of a rectangle is the 4 sides added together

        - calculateArea(): [void]
        calculate the area and store the result into the area instance variable

        an area of a rectangle is the height x width

        Create a separate class to create Rectangle objects and test the methods created*/

public class Rectangle
{

    double base;
    double height;
    double perimeter;
    double area;


    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                " cm, height=" + height +
                " cm, perimeter=" + perimeter +
                " cm, area=" + area +
                " cm^2}";
    }

    public void calculateArea(){
      area = base*height;
        System.out.println("The area equal "+ area + " cm^2");
     }

     public void calculatePerimeter(){
     perimeter= 2*(height+base);
         System.out.println("The perimeter equal "+ perimeter+" cm");
    }
}