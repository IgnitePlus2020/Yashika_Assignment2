//Menu based program to find the area of circle,rectangle and square
package com.tgt.igniteplus;
import java.util.*;
public class ExampleSwitch {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("1.To find area of circle");
        System.out.println("2.To find area of rectangle");
        System.out.println("3.To find area of square");
        System.out.println("enter your choice");
        a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter the radius of circle");
                float r = in.nextFloat();
                System.out.println("The area of circle is " + (3.14 * r * r));
                break;
            case 2:
                System.out.println("Enter the length and breadth of rectangle");
                int l = in.nextInt();
                int b = in.nextInt();
                System.out.println("The area of rectangle is " + (l * b));
                break;
            case 3:
                System.out.println("Enter the side value");
                int s = in.nextInt();
                System.out.println("The area of rectangle is " + (s * s));
                break;
            default:
                System.out.println("Invalid option");

        }

    }
}
