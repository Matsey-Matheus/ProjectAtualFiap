package logica.aulas.aula08;

import java.util.Calendar;

public class DataClasse {

	public static void main(String[] args) {
	
		Calendar c = Calendar.getInstance();
	
		System.out.println("Data e Hora atual: " + c.getTime());
		
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + (c.get(Calendar.MONTH) + 1));
		System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Hora: " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto: " + c.get(Calendar.MINUTE));

	}

}
