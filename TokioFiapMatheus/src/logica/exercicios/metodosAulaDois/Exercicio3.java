package logica.exercicios.metodosAulaDois;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Primeiro numero: ");
		double num1 = tec.nextDouble();
		
		System.out.print("Operação: ");
		char opr = tec.next().charAt(0);
		
		System.out.print("Segundo numero: ");
		double num2 = tec.nextDouble();
		
		System.out.println(calc(num1, num2, opr));

	}
	
	static double calc(double num1, double num2, char opr) {
		
		double total = 0;
		
		if (opr == '+') {
			
			total = num1 + num2;
			
		} else if (opr == '-') {
			
			total = num1 - num2;
		
		} else if (opr == '*') {
			
			total = num1 * num2;
			
		} else if (opr == '/') {
			
			total = num1 / num2;
			
		}
		
		return total;
		
	}

}
