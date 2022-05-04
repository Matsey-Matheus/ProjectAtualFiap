package logica.exercicios.metodosAulaDois;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite sua idade: " );
		int idade = tec.nextInt();
		
		System.out.println(a(idade));
		
	}
	
	static String a(int idade) {

		String vot = null;
		
		System.out.println("");
		
		if (idade >= 18 && idade <= 70) { 
			
			vot = "Obrigatorio.";
			
		} else if (idade < 16) {
			
			vot = "Não pode votar.";
			
		} else if ((idade >= 16 && idade < 18) || idade > 70) {
			
			vot = "Opcional.";
			
		}
		
		return vot;
		
	}

}
