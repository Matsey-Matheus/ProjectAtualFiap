package logica.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double nota; // DECLADAR A VARIAVEL ANTES PARA ELA SER GLOBAL
		double nota2; //---------------------------------------------
	
		// PRIMEIRA NOTA
		
		do {
			
			System.out.print("Primeira nota: ");
			nota = teclado.nextDouble();
			
			if (nota < 0 || nota > 10) {
				
				System.out.println("");
				System.out.println("Digite uma nota valida.");
				System.out.println("");
				
			}
			
		} while(nota < 0 || nota > 10);
		
		// SEGUNDA NOTA
		
		do {
			
			System.out.print("Segunda nota: ");
			System.out.print("");
			nota2 = teclado.nextDouble();
			
			if (nota2 < 0 || nota2 > 10) {
				
				System.out.println("");
				System.out.println("Digite uma nota valida.");
				System.out.println("");
				
			}	
			
		} while (nota2 < 0 || nota2 > 10);
		
		// NOTA TOTAL
		
		double total = (nota + nota2) /2;
		
		System.out.println("");
		System.out.println("A média é: " + total);
		

	}

}
