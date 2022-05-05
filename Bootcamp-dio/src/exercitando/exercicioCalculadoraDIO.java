package exercitando;

import java.util.Scanner;

public class exercicioCalculadoraDIO {
	
	public static void main(String[] args) {
		
			
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
				
		System.out.println("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
				
		System.out.println("Qual operação deseja fazer: ");
		String op = entrada.next();
				
		//lógica
				
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "&".equals(op) ? num1 % num2 : resultado;
				
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
				
		entrada.close();			
	}

}
