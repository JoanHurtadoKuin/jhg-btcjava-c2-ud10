package Ex05;

public class Password {

	private static String NUMEROS = "0123456789";
	private static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";

	private int longitud;
	private String contrase�a;

	public Password() {
		this.longitud = 8;
		this.contrase�a = cogerContrase�a(longitud);
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = cogerContrase�a(longitud);

	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public static String cogerContrase�a(int length) {
		return generarContrase�a(NUMEROS + MAYUSCULAS + MINUSCULAS, length);
	}

	public static String generarContrase�a(String key, int length) {
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
			if (Character.isDigit(contrase�a.charAt(i))) {//Miramos si el char de "i" es un digito
				numeros++;
			} else if (contrase�a.charAt(i) == Character.toUpperCase(contrase�a.charAt(i))) {//Si son mayus
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
		return "Password [longitud=" + this.longitud + ", contrase�a=" + this.contrase�a + "]";
	}

}
