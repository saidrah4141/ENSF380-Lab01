/*
 * Application.java
 * Lab01
 * Said Rahmani
 * July 3,2024
 */


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
	        
	        while(!operation.equals("exit")) {
	        	System.out.println("\nEnter operation (add, subtract, multiply, divide, "
	        			+ "pow, sqrt, log, log10, sin, cos, tan, factorial,permutation) or 'exit' "
	        			+ "to quit:");

	        operation = scanner.next();
	        if(operation.equals("exit")){
	        	break;
	        }
	        
	    
	        
	        
	     // For operations requiring two inputs
	        if (!operation.equalsIgnoreCase("sqrt") && 
	            !operation.equalsIgnoreCase("log") && 
	            !operation.equalsIgnoreCase("log10") && 
	            !operation.equalsIgnoreCase("sin") && 
	            !operation.equalsIgnoreCase("cos") && 
	            !operation.equalsIgnoreCase("tan") && 
	            !operation.equalsIgnoreCase("factorial")) {
	            
	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            switch (operation.toLowerCase()) {
	                case "add":
	                    System.out.println("Result: " + add(num1, num2));
	                    break;
	                case "subtract":
	                    System.out.println("Result: " + subtract(num1, num2));
	                    break;
	                case "multiply":
	                    System.out.println("Result: " + multiply(num1, num2));
	                    break;
	                case "divide":
	                    System.out.println("Result: " + divide(num1, num2));
	                    break;
	                case "pow":
	                    System.out.println("Result: " + power(num1, num2));
	                    break;
	                case "permutation":
	                	System.out.println("Result" + permutations(num1,num2));
	                	break;
	                default:
	                    System.out.println("Invalid operation.");
	                    break;
	            }
	        } else {
	            // For operations requiring one input
	            System.out.print("Enter number (use degrees if entering and angle): ");
	            double num = scanner.nextDouble();

	            switch (operation.toLowerCase()) {
	                case "sqrt":
	                    System.out.println("Result: " + sqrt(num));
	                    break;
	                case "log":
	                    System.out.println("Result: " + log(num));
	                    break;
	                case "log10":
	                    System.out.println("Result: " + log10(num));
	                    break;
	                case "sin":
	                    System.out.println("Result: " + sin(Math.toRadians(num)));
	                    break;
	                case "cos":
	                    System.out.println("Result: " + cos(Math.toRadians(num)));
	                    break;
	                case "tan":
	                    System.out.println("Result: " + tan(Math.toRadians(num)));
	                    break;
	                case "factorial":
	                    // Factorial is a special case requiring an integer
	                    System.out.println("Result: " + factorial((int) num));
	                    break;
	                default:
	                    System.out.println("Invalid operation.");
	                    break;
	            }
	        }
	        

	            
	           
	        }
	        scanner.close();

        }
	    }
	    
		

	/*
	 * computes the addition of two numbers.
	 * 
	 * @param a (double) The first number to add.
	 * @param b (double) The second number to add.
	 * @return The sum of a and b (double).
	 */
	public static double add(double a, double b) {
	    return a + b;
	}

	/*
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
	
	/*
	 * computes the multiplication of two numbers.
	 * 
	 * @param a (double) The first number to multiply.
	 * @param b (double) The second number to multiply.
	 * @return The multiplication of a and b (double).
	 */
	public static double multiply(double a, double b) {
		return a*b;
		
		
		
		
		
		
		
	}
	
	/*
	 * 
	 * computes the subtraction of two numbers.
	 * 
	 * @param a (double) The first number to subtract.
	 * @param b (double) The second number to subtract.
	 * @return The difference of a and b (double).
	 */
	public static double subtract(double a, double b) {
		return a-b;
	}
	
	/*
	 * computes the division of two numbers.
	 * 
	 * @param a (double) The dividend.
	 * @param b (double) The divisor.
	 * @return The quotient(double).
	 */
	public static double divide(double a, double b) {
		if(b==0) {
			System.out.println("Can't divide by zero!");
			return 0;
		} else {
			return a/b;
		}
		
		
	}
	
	// Factorial calculation with progress display
	public static long factorial(int num) {
	    if (num < 0) {
	        System.out.println("Factorial of negative number is undefined.");
	        return 0;
	    }
	    return factorialHelper(num, num);
	}

	private static long factorialHelper(int originalNum, int num) {
	    if (num <= 1) {
	    	int progress = (int)(((originalNum - num) / (double)originalNum) * 100);
	 	    System.out.print("\rCalculating factorial: " + progress + "%");
	        return 1;
	       
	    }
	    // Calculate progress and update progress bar
	    int progress = (int)(((originalNum - num) / (double)originalNum) * 100);
	    System.out.print("\rCalculating factorial: " + progress + "%");
	    return num * factorialHelper(originalNum, num - 1);
	}
	/*
	 * Calculates the result of raising a base to a power.
	 * 
	 * @param base The base number(double).
	 * @param exponent The exponent to raise the base to(double).
	 * @return The result of base raised to the power of exponent(double).
	 */
	public static double power(double base, double exponent) {
	    return Math.pow(base, exponent);
	}

	/*
	 * Calculates the square root of a number(double).
	 * 
	 * @param number The number(double) to calculate the square root of.
	 * @return The square root of the given number(double).
	 */
	public static double sqrt(double number) {
	    return Math.sqrt(number);
	}

	/*
	 * Calculates the natural logarithm (base e) of a number(double).
	 * 
	 * @param number The number(double) to calculate the natural logarithm of.
	 * @return The natural logarithm of the given number(double).
	 */
	public static double log(double number) {
	    return Math.log(number);
	}

	/*
	 * Calculates the base-10 logarithm of a number(double).
	 * 
	 * @param number The number(double) to calculate the base-10 logarithm of.
	 * @return The base-10 logarithm of the number (double).
	 */
	public static double log10(double number) {
	    return Math.log10(number);
	}

	/*
	 * Calculates the sine of an angle (in radians).
	 * 
	 * @param angleRadians The angle in radians.
	 * @return The sine of the angle(double).
	 */
	public static double sin(double angleRadians) {
	    return Math.sin(angleRadians);
	}

	/*
	 * Calculates the cosine of an angle (in radians).
	 * 
	 * @param angleRadians The angle in radians.
	 * @return The cosine of the angle (double).
	 */
	public static double cos(double angleRadians) {
	    return Math.cos(angleRadians);
	}

	/*
	 * Calculates the tangent of an angle (in radians).
	 * 
	 * @param angleRadians The angle in radians.
	 * @return The tangent of the angle (double).
	 */
	public static double tan(double angleRadians) {
	    return Math.tan(angleRadians);
	}

	/*
	 * Calculates the permutation of two numbers
	 * 
	 * @param numObj total number of objects and select number of objects selected
	 * @return the permutation of those two numbers (double).
	 */
	public static double permutations(double total, double select) {
		if (select<0 || total <0) {
			System.out.println("Can't have negative");
			return 0;
		} else if (total<select) {
			System.out.println("Can't select more items than availble");
			return 0;
		} else if (total>100 || select>100) {
			System.out.println("Can't have/select more than 100 items");
			return 0;
		} 
		while(select!=0) {
			return total * permutations(total-1,select-1);
		}
		return 1;
		
	}
	
	/*
	 * Calculates the permutation of two numbers
	 * 
	 * @param numObj total number of objects and select number of objects selected
	 * @return the permutation of those two numbers (double).
	 */
	public static double permutationsV2(double total, double select) {
		  if (select<0 || total <0) {
			System.out.println("Can't have negative");
			return 0;
		} else if (total<select) {
			System.out.println("Can't select more items than availble");
			return 0;
		} else if (total>100 || select>100) {
			System.out.println("Can't have/select more than 100 items");
			return 0;
		} 
		int permutation=1;
		
		for(int i=(int)select;i>0;i--) {
			permutation*=(total-i);
		}
		return(permutation);
	}



}
