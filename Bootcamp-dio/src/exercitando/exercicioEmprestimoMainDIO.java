package exercitando;

import java.util.Scanner;

public class exercicioEmprestimoMainDIO {
	
	public static void main(String[] args) {
	
		System.out.println("Exercicio empr�stimo");
		
		System.out.println("Digite o valor de empr�stimo: ");
		Scanner entrada = new Scanner(System.in);
		double valorreal = entrada.nextDouble();
		entrada.close();
		
		exercicioEmprestimoDIO.calcular(valorreal, exercicioEmprestimoDIO.getDuasParcelas());
		exercicioEmprestimoDIO.calcular(valorreal, exercicioEmprestimoDIO.getTresParcelas());
		
	}
}
