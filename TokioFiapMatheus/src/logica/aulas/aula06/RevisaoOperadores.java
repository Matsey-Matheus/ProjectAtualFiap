package logica.aulas.aula06;

public class RevisaoOperadores {

	public static void main(String[] args) {
		
		/*
		float num1 = (float) 4.0;
		float num2 = (float) 5.0;
		
		float media = (num1 + num2) /2;

		System.out.println(media);
		*/
		
		int numero = 5;
		int valor = 5 + numero++; // POS INCREMENTO
		System.out.println(valor);
		System.out.println(numero);
		
		
		int valor2 = 5 + ++numero;
		System.out.println(valor2);
		
	}

}
