package funtec.edu.calculadora.models;

public class Division implements Operation{
	@Override
	public double performOperation(double num1, double num2){
		if(num2 == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		} else {
			return num1 / num2;
		}
	}
}