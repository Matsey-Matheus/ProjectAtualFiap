package logica.exercicios;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		
		int senha = entrada.nextInt();
		
		if (senha < 99999) {
			
			while (senha < 99999) {
				
				System.out.println("");
				System.out.println("Senha fraca.");
				System.out.println("");
				
				System.out.print("Digite a senha: ");
				int senha2 = entrada.nextInt();
				
				if (senha2 > 99999) {
					
					break;
					
				}
				
				senha = senha2;
				
			}
			
		}
	
		System.out.println("eae");
		
		int senha2 = 3;
		
	}

}
