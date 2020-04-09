//To display the elements in an array and calculate the sum of elements
package com.tgt.igniteplus;

public class ExampleForEachLoop {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        float sum=0;
        for(int i:a){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Sum of elements= "+sum);
    }
}
