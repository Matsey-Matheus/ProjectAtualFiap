package logica.aulas.aula06;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		// -----------------------------
		// ESTRUTURA CONDICIONAL SIMPLES
		// -----------------------------
		
		/*
		float nota = 10;
		
		if (nota >= 6) {
			
			System.out.println("Nota: " + nota);
			
		} else {
		
			System.out.println("Repetiu.");
			
		}
		
		System.out.println("Fim");
		System.out.println("");
		
		// IDADE 
		
		int idade = 17;
		
		if (idade < 18) {
			
			System.out.println("Menor de Idade");
			
		} */
		
		// ------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA
		// ------------------------------
		
		/*
		double nota = 4;
		
		if (nota < 6) {
			
			System.out.println("Reprovou, vacilão");
			
		} else {
			
			System.out.println("Aprovado");
			
		} 
		
		System.out.println(""); */
		
		System.out.print("Coloque sua idade: ");
		
		Scanner initialIdade = new Scanner(System.in);
		int idade = initialIdade.nextInt();
		
		if (idade < 18 && idade > 0) {
			
			System.out.println("Você é menor de idade.");
			
		} else if (idade < 1 || idade > 99) {
			
			System.out.println("Idade invalida.");
			
		} else {
			
			System.out.println("Você é maior de idade.");
			
		} 

	} 

}
