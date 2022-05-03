package logica.aulas.aula09;

public class RevisaoMatriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[2][7];

		System.out.println(matriz[0][5]);
		System.out.println(matriz.length);
		System.out.println(matriz[0].length);
		 
		matriz[1][4] = 5;
		 
		System.out.println(matriz[1][4]);
		 
		matriz[1][2] = 6;
		matriz[0][3] = 13;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			
			for(int col = 0; col < matriz[0].length; col++) {
			 
				System.out.printf("Lin: %d -- Col: %d -- Valor: %d \n", linha, col, matriz[linha][col]);
			 
			}
			
			System.out.println("");
			
		}
		 
	}

}
