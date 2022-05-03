package logica.exercicios.metodos;

public class Exercicio4 {

	public static void main(String[] args) {
		
		System.out.print("Digite um numero: ");

	}
	
	static void calc(int num1, int num2, String opr) {
		
		if (opr == "+") {
			
			System.out.println(num1 + num2);
			
		} else if (opr == "-") {
			
			System.out.println(num1 - num2);
			
		} else if (opr == "*") {
			
			System.out.println(num1 * num2);
			
		} else if (opr == "/") {
			
			System.out.println(num1 / num2);
			
		}
		
	}

}
