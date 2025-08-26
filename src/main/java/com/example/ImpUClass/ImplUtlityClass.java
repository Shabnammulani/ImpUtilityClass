package com.example.ImpUClass;

import com.example.mavenproject.UtilityClass;   // Import the class from your jar

public class ImplUtlityClass {
    public static void main(String[] args) {
        
        int a = 50;
        int b = 10;
        
        int sum = UtilityClass.add(a, b);
        int diff = UtilityClass.sub(a, b);
        int product = UtilityClass.mul(a, b);
        int quotient = UtilityClass.div(a, b);
        
        System.out.println("Addition is: " + sum);
        System.out.println("Subtraction is: " + diff);
        System.out.println("Multiplication is: " + product);
        System.out.println("Division is: " + quotient);
    }
}
