package LW01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter odd length word: ");
        String word= input.next();
        int length = (word.length())/2;
        System.out.print("The Middle Character is: "+ word.substring(length,length+1));

    }

}
