

import java.util.Scanner;

public class EJERCICIOJAVA2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un texto:");
		String texto = scanner.nextLine();

		char[] textoModificado = texto.toCharArray();

		int vocalesSinTilde = 0;
		int vocalesConTilde = 0;
		int consonantes = 0;

		for (int i = 0; i < textoModificado.length; i++) {
			char c = textoModificado[i];
			switch (c) {
			case 'a', 'e', 'i', 'o', 'u':
				textoModificado[i] = 'x';
				vocalesSinTilde++;
				break;
			case 'á', 'é', 'í', 'ó', 'ú':
				textoModificado[i] = 'y';
				vocalesConTilde++;
				break;
			case 'b':
				textoModificado[i] = 'B';
				consonantes++;
				break;
			case 'R':
				textoModificado[i] = 'r';
				consonantes++;
				break;
			default:

				break;
			}
		}

		int totalCambios = vocalesSinTilde + vocalesConTilde + consonantes;

		System.out.println("Texto original: " + texto);
		System.out.println("Texto modificado: " + new String(textoModificado));
		System.out.println("Número de cambios de vocales minúsculas sin tilde: " + vocalesSinTilde);
		System.out.println("Número de cambios de vocales minúsculas con tilde: " + vocalesConTilde);
		System.out.println("Número de cambios de consonantes: " + consonantes);
		System.out.println("Número total de cambios: " + totalCambios);

		scanner.close();
	}
}
