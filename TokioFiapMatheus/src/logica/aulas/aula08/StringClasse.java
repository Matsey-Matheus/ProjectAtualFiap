package logica.aulas.aula08;

public class StringClasse {

	public static void main(String[] args) {
		
		String str = "FIAP Paulista TOP";
		
		System.out.println(str);
		
		System.out.println("");
		
		int tamanhoStr = str.length(); // LENGTH QUANTIDADE DE INFORMAÇÕES
		
		for (int i = 0; i < tamanhoStr; i++) {
			
			System.out.print(str.charAt(i));
			
		}

	}

}
