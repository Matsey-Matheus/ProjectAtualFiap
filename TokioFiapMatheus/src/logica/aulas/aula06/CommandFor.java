package logica.aulas.aula06;

import java.util.Scanner;

public class CommandFor {

	public static void main(String[] args) {
		
		//FOR PADRAO, FACIL PRA KRL
		
		/*
		
		Scanner teclado = new Scanner(System.in);
		
		int cc;
		
		do {
			
			System.out.print("Digite o numero de cambalhotas: ");
			cc = teclado.nextInt();
			
			if (cc > 30) {
				
				System.out.println("");
				System.out.println("Digite um numero menor.");
				System.out.println("");
				
			}
			
		} while (cc > 30);
		
		for (int max = 1; max <= cc; max++) {
			
			System.out.println("");
			System.out.println("Cambalhota " + max);
			
		}	*/
		
		//FOR COMPLICADO PRA KRL
		
		for (int i = 0; i <= 3; i++) {
			
			for (int j = 0; j <= 2; j+=2) {
				
				System.out.printf("%d, %d \n", i, j);
				
			}
			
		}

	}

}
