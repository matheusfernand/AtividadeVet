package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Insira o numero para a posicao " + i + ":");
			vetor[i] = sc.nextInt();
		}
		Arrays.sort(vetor);

		System.out.println("O maior valor �: " + vetor[4] + " e est� na posi��o 4");
		System.out.println("O segundo maior valor �: " + vetor[3] + " e est� na posi��o 3");
		System.out.println("O terceiro maior valor �: " + vetor[2] + " e est� na posi��o 2");

		sc.close();
	}
}
