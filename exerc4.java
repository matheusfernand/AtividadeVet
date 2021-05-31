package Atividades;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Insira o numero para a posicao " + i + ":");
			vetor[i] = sc.nextInt();
		}

		int menorValor = vetor[0];

		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] < menorValor) {
				menorValor = vetor[i];
			}
		}

		int maiorValor = menorValor;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}

		int segundoMaiorValor = menorValor;

		for (int i = 0; i < vetor.length; i++) {
			if ((vetor[i] > menorValor) && (vetor[i] != maiorValor)) {
				menorValor = vetor[i];
				segundoMaiorValor = menorValor;
			}
		}
		int terceiroMaiorValor = menorValor;

		for (int i = 0; i < vetor.length; i++) {
			if ((vetor[i] > menorValor) && (vetor[i] != segundoMaiorValor)) {
				menorValor = vetor[i];
				terceiroMaiorValor = menorValor;

	}
}
		System.out.println("Segundo Maior Valor: " + segundoMaiorValor);
		System.out.println("Maior Valor: " + maiorValor);
		System.out.println("Terceiro maior valor: " + terceiroMaiorValor);
	}
}
