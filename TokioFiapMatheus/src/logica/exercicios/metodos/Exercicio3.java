package logica.exercicios.metodos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = i.nextInt();
		
		votacao(idade);
		
		i.close();
		
	}
	
	static void votacao(int idade) {
		
		System.out.println("");
		
		if (idade >= 18) { 
			
			System.out.println("Seu voto é obrigatório.");
			
		} else if (idade < 16) {
			
			System.out.println("Você ainda não pode votar.");
			
		} else if (idade >= 16 && idade < 18) {
			
			System.out.println("Seu voto é opcinal.");
			
		}
		
		
		
	}

}
