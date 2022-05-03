package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
	static void saudacao(String nome, int idade) {
	
		System.out.println("Seja bem vindo ao programa!!");
		
		Scanner tec = new Scanner(System.in);
		
		if (idade < 18) {
			
			System.out.println("Olá " + nome + "! Você é menor de idade");
			
		} else {
			
			System.out.println("Olá " + nome + "! Você é maior de idade");
			
		}
		
		tec.close();
		
	}

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String name = n.next();
		
		System.out.print("Digite sua idade: ");
		int idade = n.nextInt();
		
		System.out.println("");
		
		saudacao(name, idade);

	}

}
