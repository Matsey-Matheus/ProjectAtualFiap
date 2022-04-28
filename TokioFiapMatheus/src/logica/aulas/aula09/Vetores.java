package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {
		
		String[] listaFrutas = new String[5];
		
		/*
		 * SEGUNDA FORMA, MSM RESULTADO
		 * 
		 * String[] listaFruits = {"Kiwi, "Jambo", etc...}; */
		
		listaFrutas[0] = "Kiwi";
		listaFrutas[1] = "Jambo";
		listaFrutas[2] = "Jabutucaba";
		listaFrutas[3] = "Pitanga";		
		listaFrutas[4] = "Imbu";
		System.out.println("Primeiro print: " + listaFrutas[4]);
		
		System.out.println();

		int qtdFrutas = listaFrutas.length; 
		
		for(int i = 0; i < qtdFrutas; i++) {
			
			System.out.println(listaFrutas[i]);
			
		}
		
	}

}
