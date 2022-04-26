package Ex04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {

		// Declaracion de variables
		Scanner sc = new Scanner(System.in);

		Calculos calculo;
		int opcion = 0;
		int num1 = 0;
		int num2 = 0;

		do {

			try {

				menu();
				opcion = sc.nextInt();
				sc.nextLine();

			} catch (InputMismatchException e) {
				System.out.println("Error en la opcion");
				sc.nextLine();
			}

		} while (opcion < 1 || opcion > 7);

		switch (opcion) {

		case 1:

			try {
				System.out.println("Suma:");
				System.out.println("Numero 1:");
				num1 = sc.nextInt();
				System.out.println("Numero 2:");
				num2 = sc.nextInt();
				calculo = new Calculos(num1, num2);
				calculo.suma();

			} catch (ArithmeticException e) {
				System.out.println("Error aritmetico: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Error en el formato");
			}

			break;
		case 2:

			try {
				System.out.println("Resta:");
				System.out.println("Numero 1:");
				num1 = sc.nextInt();
				System.out.println("Numero 2:");
				num2 = sc.nextInt();
				calculo = new Calculos(num1, num2);
				calculo.resta();
			} catch (ArithmeticException e) {
				System.out.println("Error aritmetico: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Error en el formato");
			}

			break;

		case 3:

			try {
				System.out.println("Multiplicacion:");
				System.out.println("Numero 1:");
				num1 = sc.nextInt();
				System.out.println("Numero 2:");
				num2 = sc.nextInt();
				calculo = new Calculos(num1, num2);
				calculo.multiplicacion();
			} catch (ArithmeticException e) {
				System.out.println("Error aritmetico:  " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Error en el formato");
			}

			break;
		case 4:

			try {
				System.out.println("Potencia:");
				System.out.println("Numero 1:");
				num1 = sc.nextInt();
				System.out.println("Numero 2:");
				num2 = sc.nextInt();
				calculo = new Calculos(num1, num2);
				calculo.potencia();
			} catch (ArithmeticException e) {
				System.out.println("Error aritmetico: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Error en el formato");
			}

			break;
		case 5:

			try {
				System.out.println("Raiz Cuadrada:");
				System.out.println("Numero 1:");
				num1 = sc.nextInt();
				calculo = new Calculos(num1);
				calculo.raizCuadrada();

			} catch (ArithmeticException e) {
				System.out.println("Error aritmetico: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Error en el formato");
			}

			break;
		case 6:

			try {
				System.out.println("Raiz Cubica:");
				System.out.println("Numero 1:");
				num1 = sc.nextInt();
				calculo = new Calculos(num1);
				calculo.raizCubica();

			} catch (ArithmeticException e) {
				System.out.println("Error aritmetico: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Error en el formato");
			}

			break;
		case 7:

			try {
				System.out.println("Division:");
				System.out.println("Numero 1:");
				num1 = sc.nextInt();
				System.out.println("Numero 2:");
				num2 = sc.nextInt();
				calculo = new Calculos(num1, num2);
				calculo.division();
			} catch (ArithmeticException e) {
				System.out.println("Error aritmetico: " + e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Error en el formato");
			}

			break;
		}

		sc.close();

	}

	private static void menu() {
		System.out.println("Selecciona una opcion:");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicacion");
		System.out.println("4 - Potencia");
		System.out.println("5 - Raiz Cuadrada");
		System.out.println("6 - Raiz Cubica");
		System.out.println("7 - Division");
	}

}
