package logica.aulas.aula09;

import java.util.Scanner;

public class RevisaoVetorMatriz {

	public static void main(String[] args) {
		
		double[] notas = new double[5];
		
		notas[0] = 0.0;
		notas[1] = 0.0;
		notas[2] = 0.0;
		notas[3] = 0.0;
		notas[4] = 0.0;
		
		Scanner tec = new Scanner(System.in);
		
		int qtdNotas = notas.length;
		double soma = 0;
		
		for(int i = 0; i < qtdNotas; i++) {
			
			System.out.print("Digite a nota " + i + ": ");
		
			notas[i] = tec.nextDouble();
			
			soma = soma + notas[i];
				
		}
		
		System.out.println(soma);
		
	}
	
}



















