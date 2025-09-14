package LW01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner out =new Scanner(System.in);

        System.out.print("Enter Outer Circle Radius: ");
        double ro = out.nextDouble();
        Circle outerCircle= new Circle (ro);

        System.out.print("Enter Inner Circle Radius: ");
        double ri = out.nextDouble();
        Circle innerCircle= new Circle (ri);

        double outercircleArea = outerCircle.computeArea();
        double innercircleArea = innerCircle.computeArea();
        double shadedArea = outercircleArea - innercircleArea;
        System.out.println("Shaded Area: " + shadedArea);
    }

}




