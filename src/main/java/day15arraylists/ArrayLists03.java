package day15arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists03 {
    public static void main(String[] args) {
        /*
            Ask user to enter a letter
            If the letter exists in the list convert it to "Got it"
            otherwise, add the element user entered into the list
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter...");
        char letter = in.next().charAt(0);
        List<Character> myList = new ArrayList<>();
        myList.add('J');
        myList.add('A');
        myList.add('V');
        myList.add('A');

        if (myList.contains(letter)) {
            myList.set(myList.indexOf(letter), 'X');
        } else {
            myList.add(letter);
        }
        System.out.println(myList);


    }
}
