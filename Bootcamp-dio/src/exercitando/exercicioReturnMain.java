package exercitando;

public class exercicioReturnMain {
	public static void main(String[] args) {
		
		System.out.println("Exercicio retornos");
		
		double areaQuadrado = exercicioReturn.area(3);
		System.out.println("�rea do quadrado:" + areaQuadrado);
		
		double areaRetangulo = exercicioReturn.area(5, 5);
		System.out.println("�rea do retangulo:" + areaRetangulo);
		
		double areaTrapezio = exercicioReturn.area(7, 8, 9);
		System.out.println("�rea do trapezio:" + areaTrapezio);
	}
	

}
