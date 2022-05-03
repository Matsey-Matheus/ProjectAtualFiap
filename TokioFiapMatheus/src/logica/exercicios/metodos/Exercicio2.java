package logica.exercicios.metodos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite a Largura: ");
		double larg = tec.nextDouble();
		
		System.out.print("Digite a Largura: ");
		double comp = tec.nextDouble();
		
		calcularArea(larg, comp);
		
		tec.close();

	}
	
	static void calcularArea(double larg, double comp) {
		
		System.out.println("");
		
		double result = larg * comp;
		
		System.out.println("As dimenções do terreno são: " + result + " m4");
		
	}

}
