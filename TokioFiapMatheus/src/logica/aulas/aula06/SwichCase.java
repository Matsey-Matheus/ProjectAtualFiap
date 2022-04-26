package logica.aulas.aula06;

public class SwichCase {

	public static void main(String[] args) {
		
		int escolhaUsario = 1;
		
		// SWITCH CASE
		
		switch (escolhaUsario) {
		
			case 0: 
				System.out.println("Sair do programa");
				break;
				
			case 1:
				System.out.println("Entrou no programa");	
				break;
				
			default:
				System.out.println("Erro");
				
		}

	}

}
