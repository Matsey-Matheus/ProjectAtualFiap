package logica.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String sim;
		
		do {
		
		System.out.println("Olá Mundo!");
		System.out.println("");
		System.out.print("Deseja ver a mensagem novamente? ");
		sim = teclado.nextLine();	
		
		} while (sim.equals("sim") || sim.equals("s") || sim.equals("Sim") || sim.equals("S"));

		System.out.println("");
		System.out.println("Programa encerrado.");
		
	}

}
