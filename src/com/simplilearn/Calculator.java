package com.simplilearn;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		char operator;
		double num1,num2,result;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the operator");
		operator = scanner.next().charAt(0);
		System.out.println("enter the values for num1 and num2");
		num1=scanner.nextDouble();
		num2=scanner.nextDouble();
		switch(operator) {
			case '+':
				result = num1 +num2;
				System.out.println("addition result is "+ result);
				break;
			case '-':
				result = num1 -num2;
				System.out.println("subtraction result is "+ result);
				break;
			case '*':
				result = num1 *num2;
				System.out.println("multiplication result is "+ result);
				break;
			case '/':
				result = num1/num2;
				System.out.println("division result is "+ result);
				break;
			default:
				System.out.println("enter valid operator");
				break;
		}
	}

}
