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

		System.out.println("O maior valor é: " + vetor[4] + " e está na posição 4");
		System.out.println("O segundo maior valor é: " + vetor[3] + " e está na posição 3");
		System.out.println("O terceiro maior valor é: " + vetor[2] + " e está na posição 2");

		sc.close();
	}
}
