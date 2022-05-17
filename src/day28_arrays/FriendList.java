package day28_arrays;
import java.util.Arrays;
import java.util.Scanner;
public class FriendList {
    /*

        Make an array of your friends names

        asking how many friends do you have

        then ask for each friend's name one at a time, store all the names into an array

        at the end print your friend list
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many friends do you have");
        int numberOfFriends = input.nextInt();
        String [] friendList = new String[numberOfFriends];
        for (int i = 0; i <friendList.length ; i++) {
            System.out.println("Enter your friend name ");
            friendList[i]= input.next();

        }System.out.println(Arrays.toString(friendList));
    }

}
