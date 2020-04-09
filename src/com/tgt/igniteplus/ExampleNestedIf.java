//To check the no. of digits in the no. entered
package com.tgt.igniteplus;
import java.util.Scanner;
public class ExampleNestedIf {
    public static void main(String[] args) {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a no.");
        a=in.nextInt();
        if(a<10)
            System.out.println(a+" is a single digit no.");
        if(a>10 && a<100)
            System.out.println(a+" is a double digit no.");
        if(a>100)
            System.out.println(a+" is a triple digit no.");
    }
}
