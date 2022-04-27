package logica.aulas.aula06;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
	/*	Scanner senha = new Scanner(System.in);
		int cc = 0;
		
		do {
			
			System.out.print("Digite a senha: ");
			Scanner senha2 = new Scanner(System.in);
			cc++;
			
		} while (cc < 3); */
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		do {
			
			System.out.print("Acerte o número para sair: ");
			numero = teclado.nextInt();
			
			System.out.println("Número escolhido: " + numero);
			System.out.println("");
			
		} while (numero != 7);
		
		System.out.println("Acertou");

	}

}
