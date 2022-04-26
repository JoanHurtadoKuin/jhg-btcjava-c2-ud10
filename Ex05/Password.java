package Ex05;

public class Password {

	private static String NUMEROS = "0123456789";
	private static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";

	private int longitud;
	private String contraseña;

	public Password() {
		this.longitud = 8;
		this.contraseña = cogerContraseña(longitud);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = cogerContraseña(longitud);

	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public static String cogerContraseña(int length) {
		return generarContraseña(NUMEROS + MAYUSCULAS + MINUSCULAS, length);
	}

	public static String generarContraseña(String key, int length) {
		String pswd = "";

		for (int i = 0; i < length; i++) {
			pswd += (key.charAt((int) (Math.random() * key.length())));
		}

		return pswd;
	}

	public boolean esFuerte() {

		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;

		for (int i = 0; i < this.longitud; i++) {
			if (Character.isDigit(contraseña.charAt(i))) {//Miramos si el char de "i" es un digito
				numeros++;
			} else if (contraseña.charAt(i) == Character.toUpperCase(contraseña.charAt(i))) {//Si son mayus
				mayusculas++;
			} else {//Si no
				minusculas++;
			}
		}

		if (mayusculas >= 2 && minusculas >= 1 && numeros > 5) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Password [longitud=" + this.longitud + ", contraseña=" + this.contraseña + "]";
	}

}
