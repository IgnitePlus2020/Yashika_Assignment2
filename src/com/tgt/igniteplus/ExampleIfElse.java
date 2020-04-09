//To check if the entered no. is even or odd
package com.tgt.igniteplus;
import java.util.Scanner;
public class ExampleIfElse {
    public static void main(String[] args) {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a no.");
        a=in.nextInt();
        if(a%2==0)
            System.out.println("the no. is even");
        else
            System.out.println("the no. is odd");
    }
}
