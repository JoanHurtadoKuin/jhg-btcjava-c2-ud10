package Ex04;

public class Calculos {

	private int num1;
	private int num2;
	
	
	public Calculos(int num1) {
		this.num1 = num1;
	}
	
	public Calculos(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void suma() {
		System.out.println("Suma: " + (num1 + num2));
	}

	public void resta() {
		System.out.println("Resta: " + (num1 - num2));
	}

	public void multiplicacion() {
		System.out.println("Multiplicacion: " + (num1 * num2));
	}

	public void potencia() {

		System.out.println("Potencia: " + (Math.pow(num1, num2)) + ". Base: " 
		+ num1 + " y exponente: " + num2);
	}

	public void raizCuadrada() {
		System.out.println("Raíz cuadrada: " + (Math.sqrt(num1)));
	}

	public void raizCubica() {
		System.out.println("Raíz cúbica: " + (Math.cbrt(num1)));
	}

	public void division() {
		System.out.println("División: " + (num1 / num2));
	}

}
