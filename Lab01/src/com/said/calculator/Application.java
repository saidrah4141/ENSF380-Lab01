package com.said.calculator ;

import java.util.Scanner;

public class Application {

	public static void main ( String [] args ) {
		if (args.length > 0) {
	        // Process CLI arguments
	    } else {
	        // No CLI arguments, ask for user input
	        Scanner scanner = new Scanner(System.in);
	        String operation="";
	        
	        while(!operation.equals("quit")) {
	        System.out.println("Enter operation (e.g., add, subtract, multiply, divide, factorial, quit):");
	        operation = scanner.next();
	        
	        double num1,num2;
	        
	        
	        // Based on user input decides which method to call
	        switch (operation.toLowerCase()) {
	        case "add":
	            System.out.println("Enter the first operand:");
	            num1 = scanner.nextDouble();
	            System.out.println("Enter the second operand:");
	            num2 = scanner.nextDouble();
	            System.out.println("Result: " + add(num1, num2));
	            break;
	        case "factorial":
	            System.out.println("Enter a number:");
	            double number = scanner.nextDouble();
	            System.out.println("Result: " + factorial(number));
	            break;
	        case "subtract":
		        System.out.println("Enter the first operand:");
	            num1 = scanner.nextDouble();
	            System.out.println("Enter the second operand:");
	            num2 = scanner.nextDouble();
	            System.out.println("Result: " + subtract(num1, num2));
	            break;
	        
	    	case "multiply":
		        System.out.println("Enter the first operand:");
	            num1 = scanner.nextDouble();
	            System.out.println("Enter the second operand:");
	            num2 = scanner.nextDouble();
	            System.out.println("Result: " + multiply(num1, num2));
	            break;
	         
	    	case "divide":
		        System.out.println("Enter the first operand:");
	            num1 = scanner.nextDouble();
	            System.out.println("Enter the second operand:");
	            num2 = scanner.nextDouble();
	            
	            // ensures divisor is not 0
	            while(num2==0) {
	            	System.out.println("Can't divide by zero! "
	            			+ "\nEnter the second operand:");
	            	num2 = scanner.nextDouble();
	            }
	            System.out.println("Result: " + divide(num1, num2));
	            break;
	            
	           
	        }
        }
	    }
	    }
		

	/**
	 * computes the addition of two numbers.
	 * 
	 * @param a (double) The first number to add.
	 * @param b (double) The second number to add.
	 * @return The sum of a and b (double).
	 */
	public static double add(double a, double b) {
	    return a + b;
	}

	/**
	 * computes the factorial of a number.
	 * 
	 * @param a (double) 
	 * @return The factorial of a(double).
	 */
	public static double factorial(double n) {
	    if (n <= 1) {
	        return 1;
	    } else {
	        return n * factorial(n - 1);
	    }
	}
	
	/**
	 * computes the multiplication of two numbers.
	 * 
	 * @param a (double) The first number to multiply.
	 * @param b (double) The second number to multiply.
	 * @return The multiplication of a and b (double).
	 */
	public static double multiply(double a, double b) {
		return a*b;
	}
	
	/**
	 * computes the subtraction of two numbers.
	 * 
	 * @param a (double) The first number to subtract.
	 * @param b (double) The second number to subtract.
	 * @return The difference of a and b (double).
	 */
	public static double subtract(double a, double b) {
		return a-b;
	}
	
	/**
	 * computes the division of two numbers.
	 * 
	 * @param a (double) The dividend.
	 * @param b (double) The divisor.
	 * @return The quotient(double).
	 */
	public static double divide(double a, double b) {
		return a/b;
	}
	
}
