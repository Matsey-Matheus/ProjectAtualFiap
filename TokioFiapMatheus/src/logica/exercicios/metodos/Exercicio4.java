package logica.exercicios.metodos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int num1 = ent.nextInt();
		
		System.out.print("Digite a operação: ");
		char op = ent.next().charAt(0);
		
		System.out.print("Digite o segundo numero: ");
		int num2 = ent.nextInt();
		
		
		
		calc(num1, num2, op);
		
		ent.close();
		
	}
	
	static void calc(int num1, int num2, char opr) {
		
		if (opr == '+') {
			
			System.out.println("Resultado: " + (num1 + num2));
			
		} else if (opr == '-') {
			
			System.out.println("Resultado: " + (num1 - num2));
			
		} else if (opr == '*') {
			
			System.out.println("Resultado: " + (num1 * num2));
			
		} else if (opr == '/') {
			
			System.out.println("Resultado: " + (num1 / num2));
			
		}
		
	}

}
