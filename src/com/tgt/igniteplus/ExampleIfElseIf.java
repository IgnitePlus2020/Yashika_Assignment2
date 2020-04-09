//To display the grade according to the marks entered
package com.tgt.igniteplus;
import java.util.Scanner;
public class ExampleIfElseIf {
    public static void main(String[] args) {
        int a;
        char grade;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the marks to check the grade");
        a=in.nextInt();
        if(a>=90)
            grade='S';
        else if(a>=70&&a<90)
            grade='A';
        else if(a>=50&&a<70)
            grade='B';
        else if(a>=30&&a<50)
            grade='C';
        else
            grade='F';
        System.out.println("Grade is: "+grade);


    }
}
