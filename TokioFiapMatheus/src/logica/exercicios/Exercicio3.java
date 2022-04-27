package logica.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escolha um numero: ");
		
		int numeroUser = teclado.nextInt();
		
		int contador = 0;
		
		while (numeroUser > contador) {
			contador++;
			
			System.out.println(contador);
			
		}
		
		

	}

}
