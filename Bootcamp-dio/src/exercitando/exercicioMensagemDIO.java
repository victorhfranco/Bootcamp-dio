package exercitando;

import java.util.Scanner;

public class exercicioMensagemDIO {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o hor�rio: ");
		
		int horas = entrada.nextInt();
		
		if (horas > 24 || horas < 0) {
			System.out.println("Hor�rio inv�lido");
		} else if (horas < 5) {
			System.out.println("Boa noite! hor�rio atual " + horas + ":00PM");
		} else if (horas >= 19) {
			System.out.println("Boa noite! hor�rio atual " + horas + ":00PM");
		} else if (horas >= 12)	{
			System.out.println("Boa tarde! hor�rio atual " + horas + ":00PM");
		} else if (horas >= 5) {
			System.out.println("Bom dia! hor�rio atual " + horas + ":00AM");
		}
		
		entrada.close();
	}

}
