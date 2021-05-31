package Atividades;

import java.util.Scanner;

public class exerc1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Insira o numero para a posicao " + i + ":");
			vetor[i] = sc.nextInt();
		}
		int maior = 0;
		int indiceMaior = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				indiceMaior = i;
			}
		}
		System.out.printf("Maior número é " + maior + " na posicao " + indiceMaior);

		sc.close();
	}
}