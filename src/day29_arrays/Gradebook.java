package day29_arrays;

public class Gradebook {
    public static void main(String[] args) {
        String [] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};
        int[] scores = {80, 54, 100, 66, 94};
        char [] grades = new char[5];
        for (int i = 0; i < names.length; i++) {
            if (scores[i] > 85){
                grades[i] = 'A';
            } else if (scores[i] > 75){
                grades[i] = 'B';
            } else if (scores[i] > 65){
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" | "+scores[i]+" | "+grades[i]);

        }
            }

        }

