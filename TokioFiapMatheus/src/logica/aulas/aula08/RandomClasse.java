package logica.aulas.aula08;

import java.util.Random;

public class RandomClasse {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		double num = rand.nextDouble();
		System.out.println(num);
		
		int teste = rand.nextInt();
		System.out.println(teste);

	}

}
