package logica.aulas.aula06;

import java.util.Scanner;

public class Atividade02Tabuada {

	public static void main(String[] args) {
		
/*		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int n = teclado.nextInt();
		
		int contador = 0;
		
		int number = 1;
		
		System.out.println("");
		
		while (contador < 10) {
			
			System.out.println(n + " x " + number + " = " + (n * number));
			
			System.out.println("");
			
			number++;
			
			contador++; 

		} */
		
		int cc = 0;
		while (cc < 10) {
			
			cc++;
			
			if (cc == 3 || cc == 5) {
				
				continue;
				
			} 
			
			if (cc == 7) {
				
				break;
				
			}
			
			System.out.println("Cambalhota " + cc);
			
		}
		
		System.out.println("Fim");
		
	}
	
}
