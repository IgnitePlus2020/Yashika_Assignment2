// To check the greatest of 2 no.s
package com.tgt.igniteplus;
import java.util.Scanner;
public class ExampleIf {
    public static void main(String[] args) {
        int a,b;
        Scanner in=new Scanner(System.in);
        System.out.println("enter two no.s");
        a=in.nextInt();
        b=in.nextInt();
        if(a>b)
            System.out.println(a+" is greater than "+b);
        System.out.println(b+" is greater than "+a);
    }
}
