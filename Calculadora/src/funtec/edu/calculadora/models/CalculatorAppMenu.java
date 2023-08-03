package funtec.edu.calculadora.models;

import java.util.Scanner;

public class CalculatorAppMenu {
	Scanner sc = new Scanner(System.in);
	public void menu() {
		int operation = 0;
		while(operation != 5) {
			
		System.out.println("""
				------------MENU------------
					Choose an operation:
				
				1 - Addition
				2 - Subtraction
				3 - Multiplication
				4 - Division
				5 - Exit
				""");
		operation = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What's number 1? ");
		double num1 = sc.nextDouble();
		System.out.println("What's number 2? ");
		double num2 = sc.nextDouble();
		
		switch (operation) {
		
		case 1:
			Addition addition = new Addition();
			System.out.println("Resultado da Adição: " + addition.performOperation(num1, num2));
			break;
		case 2:
			Subtraction subtraction = new Subtraction();
			System.out.println("Resultado da Subtração: " + subtraction.performOperation(num1, num2));
			break;
		case 3:
			Multiplication multiplication = new Multiplication();
			System.out.println("Resultado da Multiplicação: " + multiplication.performOperation(num1, num2));
			break;
		case 4:
			Division division = new Division();
			try {
	            System.out.println("Resultado da Divisão: " + division.performOperation(num1, num2));
	            break;
	        } catch (ArithmeticException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
		case 5:
			operation = 5;
			break;
		default:
			System.out.println("[ERROR] Choose an operation again! ");
			break;
		}
		}
	}
}