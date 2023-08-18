package com.interswitch.sample2;

import com.interswitch.maven.SimpleArithmetic;

import java.util.Scanner;

public class Trial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        SimpleArithmetic sa = new SimpleArithmetic(num1, num2);

        String multipleLines = """
                Select an Operation of Calculation you want: 
                1 -- For Division
                2 -- For Addition
                3 -- For Subtraction
                4 -- For Multiplication
                """;
        System.out.println(multipleLines);

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Division result: " + sa.division());
                break;
            case 2:
                System.out.println("Addition result: " + sa.addition());
                break;
            case 3:
                System.out.println("Subtraction result: " + sa.subtraction());
                break;
            case 4:
                System.out.println("Multiplication result: " + sa.multiplication());
                break;
        }
        scanner.close();
    }
}
