/*- Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o
valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

import java.util.Scanner;
public class ExeE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu número de funcionário: ");
		int num = scanner.nextInt();
		
		System.out.println("Digite seu número de horas trabalhadas: ");
		int horas = scanner.nextInt();
		
		System.out.println("Digite o valor que recebe por hora: ");
		double valorPorHora = scanner.nextDouble();
		
		double salario = horas * valorPorHora;
		
		System.out.println("Número = " + num + "\n");
		System.out.printf("Salário = R$%.2f", salario);

	}
   
}
