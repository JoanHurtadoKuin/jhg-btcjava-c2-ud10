package Ex01;

public class NumeroRandom {
	
	int numAleatorio;

	public NumeroRandom() {
		this.numAleatorio = generarNumeroAleatorio();
	}

	private int generarNumeroAleatorio() {

		 int numeroAleatorio = (int) Math.floor(Math.random() * (500 - 1 + 1) + 1);		
	
		return numeroAleatorio;
	}

	public int getNumAleatorio() {
		return numAleatorio;
	}

	public void setNumAleatorio(int numAleatorio) {
		this.numAleatorio = numAleatorio;
	}
	
	
}
