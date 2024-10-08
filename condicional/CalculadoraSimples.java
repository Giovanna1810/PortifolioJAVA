//Desenvolvido por Diogo Barbosa no dia 02/09/2024
import java.util.Scanner;
public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor1 = 0;
		int opcao = 0;
		double valor2 = 0;
		double resultado = 0;
		
		while(opcao != 5)
		{
			System.out.println("\n====Calculadora====\n");
			System.out.println("\nEscolha uma opção.\n");
			System.out.println("1.Adição\n");
			System.out.println("2.Subtração\n");
			System.out.println("3.Multiplicação\n");
			System.out.println("4.Divisão\n");
			System.out.println("5.Sair");
			opcao = sc.nextInt();
			switch(opcao)
			{
			case 1:
				System.out.print("\nDigite o primeiro valor: ");
				valor1 = sc.nextDouble();
				System.out.print("\nDigite o segundo valor: ");
				valor2 = sc.nextDouble();	
				resultado = valor1 + valor2;
				System.out.println("\nO resultado da adição é: "+ resultado);
				break;
				
			case 2:
				System.out.print("\nDigite o primeiro valor: ");
				valor1 = sc.nextDouble();
				System.out.print("\nDigite o segundo valor: ");
				valor2 = sc.nextDouble();
				resultado = valor1 - valor2;
				System.out.println("\nO resultado da subtração é: " + resultado);
				break;
				
			case 3:
				System.out.print("\nDigite o primeiro valor: ");
				valor1 = sc.nextDouble();
				System.out.print("\nDigite o segindo valor: ");
				valor2 = sc.nextDouble();
				resultado = valor1 * valor2;
				System.out.println("\nO valor da multiplicação é: " + resultado);
				break;
				
			case 4:
				System.out.print("\nDigite o primeiro valor: ");
				valor1 = sc.nextDouble();
				System.out.print("\nDigite o segundo valor: ");
				valor2 = sc.nextDouble();
				if(valor2 <= 0)
				{
					System.out.println("\nNenhum número é divisivel por 0. "
							+ "Reinicie o programa e tente novamente.");
				}
				else
				{
					resultado = valor1 / valor2;
					System.out.println("\nO resultado da divisão é: " + resultado);
				}
				break;
				
			case 5:
				System.out.println("\n=== Obrigado por utilizar nossa calculadora!!! ===");
				break;
				
			}
			
		}
			
		
		

	}

}
