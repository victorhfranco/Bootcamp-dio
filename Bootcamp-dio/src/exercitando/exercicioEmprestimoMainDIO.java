package exercitando;

import java.util.Scanner;

public class exercicioEmprestimoMainDIO {
	
	public static void main(String[] args) {
	
		System.out.println("Exercicio empréstimo");
		
		System.out.println("Digite o valor de empréstimo: ");
		Scanner entrada = new Scanner(System.in);
		double valorreal = entrada.nextDouble();
		entrada.close();
		
		exercicioEmprestimoDIO.calcular(valorreal, exercicioEmprestimoDIO.getDuasParcelas());
		exercicioEmprestimoDIO.calcular(valorreal, exercicioEmprestimoDIO.getTresParcelas());
		
	}
}
