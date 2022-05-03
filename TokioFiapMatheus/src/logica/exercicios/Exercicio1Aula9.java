package logica.exercicios;

public class Exercicio1Aula9 {

	public static void main(String[] args) {
		
		String[] nomes = {"Alexande", "Arthur", "Samuel", "Lucas"};
		
		String nome = nomes[0];
		
		System.out.println(nome);
		System.out.println("");
		
		
		
		for(int i = 0; i < nomes.length; i++) {
			
			for(int u = i + 1; u < nomes.length; u++) {
				
				if (i != u) {
				
					System.out.println(nomes[u] + " / " + nomes[i]);
					
					continue;
					
				}
				
			}
			
		}

	}

}
