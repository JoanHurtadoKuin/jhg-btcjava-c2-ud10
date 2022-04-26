package Ex03;

public class NumeroRandom extends Exception{
	
	int numAleatorio;

	public NumeroRandom() {
		this.numAleatorio = generarNumeroAleatorio();
	}

	private int generarNumeroAleatorio() {

		 int numeroAleatorio = (int) Math.floor(Math.random() * (999 - 0 + 1) + 0);		
	
		return numeroAleatorio;
	}

	public int getNumAleatorio() {
		return numAleatorio;
	}

	public void setNumAleatorio(int numAleatorio) {
		this.numAleatorio = numAleatorio;
	}
	
	public void esParImpar() {
		
		if(this.numAleatorio%2==0) {
			System.out.println("El numero es par");
		}else {
				System.out.println("El numero es impar");
		}
	}
	
	
}
