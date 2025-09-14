package LW01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter centimeter value: ");
        double value = input.nextDouble();
        System.out.println("Feet: "+ (value/30));
        System.out.println("Inches: "+ (value/2.54));
    }
}
