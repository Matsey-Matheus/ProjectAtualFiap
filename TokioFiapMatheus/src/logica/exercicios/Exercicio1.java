package logica.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		System.out.print("Digite um numero: ");
		
		Scanner initial = new Scanner(System.in);
		int number = initial.nextInt();

		if ((number %2) == 0) {
			
			System.out.println("Seu numero é Par.");
			
		} else {
			
			System.out.println("Seu numero é Impar.");
			
		}
		
	}

}
