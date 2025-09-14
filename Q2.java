package LW01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter Your First Name: ");
        String first = scn.next();
        System.out.print("Enter Your Second Name: ");
        String second = scn.next();
        System.out.print("Enter Your Last Name: ");
        String last = scn.next();
        System.out.println(last+", "+first+" "+(second.substring(0,1))+".");

    }
}
