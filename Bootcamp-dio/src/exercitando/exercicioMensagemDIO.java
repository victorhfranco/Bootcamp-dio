package exercitando;

import java.util.Scanner;

public class exercicioMensagemDIO {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o horário: ");
		
		int horas = entrada.nextInt();
		
		if (horas > 24 || horas < 0) {
			System.out.println("Horário inválido");
		} else if (horas < 5) {
			System.out.println("Boa noite! horário atual " + horas + ":00PM");
		} else if (horas >= 19) {
			System.out.println("Boa noite! horário atual " + horas + ":00PM");
		} else if (horas >= 12)	{
			System.out.println("Boa tarde! horário atual " + horas + ":00PM");
		} else if (horas >= 5) {
			System.out.println("Bom dia! horário atual " + horas + ":00AM");
		}
		
		entrada.close();
	}

}
