package logica.exercicios.metodosAulaDois;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Largura: ");
		double num1 = tec.nextDouble();
		
		System.out.print("Comprimento: ");
		double num2 = tec.nextDouble();
		
		System.out.println("");
		System.out.println("Area: " + Operacao(num1, num2) + " m4");
		
		tec.close();
		
	}
	
	static double Operacao(double a, double b) {
		
		double total = a * b;
		
		return total;
		
	}

}
