package Atividades;

import java.util.Random;
import java.util.Scanner;

public class exerc6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		int[] vetor = new int[9];
		int n;

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(9);
		}

		/* Habilitar esse sysout para testar o código */
		/* System.out.println(vetor[i]);} */

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um valor: ");
			n = sc.nextInt();
			if (n == vetor[0]) {
				System.out.println("Você acertou o número " + n + " na posição 1!");
			} else if (n == vetor[1]) {
				System.out.println("Você acertou o número " + n + " na posição 2!");
			} else if (n == vetor[2]) {
				System.out.println("Você acertou o número " + n + " na posição 3!");
			} else if (n == vetor[3]) {
				System.out.println("Você acertou o número " + n + " na posição 4!");
			} else if (n == vetor[4]) {
				System.out.println("Você acertou o número " + n + " na posição 5!");
			} else if (n == vetor[5]) {
				System.out.println("Você acertou o número " + n + " na posição 6!");
			} else if (n == vetor[6]) {
				System.out.println("Você acertou o número " + n + " na posição 7!");
			} else if (n == vetor[7]) {
				System.out.println("Você acertou o número " + n + " na posição 8!");
			} else if (n == vetor[8]) {
				System.out.println("Você acertou o número " + n + " na posição 9!");
			} else if (n == vetor[9]) {
				System.out.println("Você acertou o número " + n + " na posição 10!");
			} else {
				System.out.println("Você não acertou nenhum número, tente novamente!");
			}
		}
		sc.close();
	}
}