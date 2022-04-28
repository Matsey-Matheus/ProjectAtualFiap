package logica.aulas.aula09;

public class ForEach {

	public static void main(String[] args) {
		
		int[] numeros = {0, 5, 11, 4};
		
		
		// FOR INDEXADO (SIMPLES)
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.printf("Pos: %d -- Valor: %d \n", i, numeros[i]);
			
		}
		
		System.out.println("");
		
		// FOR EACH
		// PERCORRE A LISTA E ACESSA OS VALORES DAS POSIÇÕES
		
		for (int numero: numeros) {
			
			System.out.printf("Valor: %d \n", numero);
			
		}
		
	}

}
