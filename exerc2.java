package Atividades;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Insira o numero para a posicao " + i + ":");
			vetor[i] = sc.nextInt();
		}
		int menor = 0;
		int indiceMenor = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] <= vetor[0]) {
				menor = vetor[i];
				indiceMenor = i;
			}
		}
		System.out.printf("Menor número é " + menor + " na posicao " + indiceMenor);
	}
}
