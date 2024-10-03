package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		final double pi = 3.14159;
		Scanner scanner = new Scanner(System.in);
		double raio = scanner.nextDouble();
		double area = pi * (raio * raio);
		System.out.printf("A=%.4f\n", area);

		scanner.close();
	}

}
