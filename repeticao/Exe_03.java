/* Fazer um programa para ler um número N. Depois leia N pares de
números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a
zero, mostrar a mensagem "divisao impossivel". */

import java.util.Scanner;
public class Exe_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Digite um número: ");
		int num = scanner.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			System.out.println("Digite o primeiro número: ");
			int num1 = scanner.nextInt();
			
			System.out.println("Digite o segundo número: ");
			int num2 = scanner.nextInt();
			
			if( num2 == 0) {
				
				System.out.println("Divisão impossível.");
			}
			
			else 
			{
				int divisao = num1 / num2;
				
				System.out.println(divisao);
			}
			
			
		}
		
		

	}

}
