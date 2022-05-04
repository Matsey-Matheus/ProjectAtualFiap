package logica.aulas.aula10;

public class MetodosComRetorno {
	
	static int somar(int a, int b) {
		
		int soma = a + b;
		return soma;
		
	} 
	
	static String saudacao(String nome) {
		
		String str = "Olá, " + nome + "! Seja bem vindo!";
		return str;
		
	}

	public static void main(String[] args) {
		
		somar(15, 22);
		System.out.println(somar(15, 22));
		
		int retornoSoma = somar(10, 20);
		System.out.println("Retorno soma: " + retornoSoma);
		
		Math.pow(37, 4);
		
		double retornoPow = Math.pow(4, 2);
		
		System.out.println(retornoPow);
		
		System.out.println(saudacao("Matheus"));

	}

}
