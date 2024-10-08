/*- Fazer um programa para ler quatro valores inteiros A, B, C e D.
A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).*/
import java.util.Scanner;
public class ExeC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite valor A: ");
		int valorA = scanner.nextInt();
		
		System.out.println("Digite valor B: ");
		int valorB = scanner.nextInt();
		
		System.out.println("Digite valor C: ");
		int valorC = scanner.nextInt();
		
		System.out.println("Digite valor D: ");
		int valorD = scanner.nextInt();
		
		double diferenca = (valorA * valorB - valorC * valorD);
		
		System.out.println("Diferença = " + diferenca);

	}

}
