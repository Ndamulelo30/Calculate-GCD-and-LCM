/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculategcdandlcm;

/**
 *
 * @author Sanele
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        
        // Calculate GCD
        int gcd = calculateGCD(num1, num2);
        
        // Calculate LCM
        int lcm = calculateLCM(num1, num2, gcd);
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        scanner.close();
    }
    
    // Method to calculate GCD using Euclid's algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // Method to calculate LCM using GCD
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    
}
