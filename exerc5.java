package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class exerc5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[10];
			System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
			System.out.println("Digite a razao: ");
		int razao = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			numero = numero * razao;
			vetor[i] = numero;
		}
		System.out.print("A progressão geométrica fica: ");
		System.out.println(Arrays.toString(vetor));

		sc.close();
	}
}
