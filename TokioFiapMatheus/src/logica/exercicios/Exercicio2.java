package logica.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		// VARIAVEIS DE ENTRADA SCANNER
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		
		double nota1 = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		
		double nota2 = entrada.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		
		double nota3 = entrada.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		
		double nota4 = entrada.nextDouble();
		
		// TOTAL DAS NOTAS
		
		double notaTotal = (nota1 + nota2 + nota3 + nota4) /4;	
		
		System.out.println("");
		
		// MÉDIA E MENSAGENS 
		
		if (notaTotal < 5) {
			
			System.out.println("Sua média foi: " + notaTotal);
			System.out.println("Você foi reprovado.");
			
		} else if ((notaTotal > 4) && (notaTotal < 7)) {
			
			System.out.println("Sua média foi: " + notaTotal);
			System.out.println("Você esta de recuperação.");
			
		} else if (notaTotal > 7) {
			
			System.out.println("Sua média foi: " + notaTotal);
			System.out.println("Você foi aprovado.");
			
		} 

	}

}
