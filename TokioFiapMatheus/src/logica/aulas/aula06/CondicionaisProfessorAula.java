package logica.aulas.aula06;

public class CondicionaisProfessorAula {

	public static void main(String[] args) {
		
		// ENCADIADO
		
		double nota = 6;
		
		if (nota < 4) {
			
			System.out.println("Reprovado");
			
		} else {
			
			if (nota < 6) {
				
				System.out.println("Recuperação");	
				
			} else {
				
				System.out.println("Aprovado");
				
			}
			
		}
		
		// ELSE IF (ENCADIADO SIMPLIFICADO)
		
		System.out.println("");
		
		float notaFinal = 10;
		
		if (notaFinal < 4) {
			
			System.out.println("Reprovado");
			
		} else if (notaFinal < 6) {
			
			System.out.println("Recuperação");
			
		}
		
		else {
			
			System.out.println("Aprovado");
			
		}

	}

}
