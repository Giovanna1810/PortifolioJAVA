/*Exercício 1 – Leia um valor inteiro X (1<= x <= 1000). Em seguida mostre os
ímpares de 1 até X, valor por linha, inclusive o X se for o caso.*/

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor entre 1 a 1000: ");
		int x = sc.nextInt();

		if (x >= 1 && x <= 1000) {

			System.out.println("Os números ímpares são: ");
			for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {

					System.out.println(i + "");
				}

			}

		}

		else {
			System.out.println("Número não está entre os números pedidos.");
		}

	}

}
