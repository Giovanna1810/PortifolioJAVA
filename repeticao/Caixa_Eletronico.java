import java.util.Scanner;

public class Caixa_Eletronico {
	public static void main(String[] args) {
		
		double saldo = 0;
		int opcao = 0;
		double valor = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		while( opcao != 4 )
		{
		  System.out.println("\n=== Caica Eletronico ===\n");	
		  System.out.println("1.Depositar\n");
		  System.out.println("2.Sacar\n");
		  System.out.println("3.Consultar\n");
		  System.out.println("4.Sair\n");
		  opcao = scanner.nextInt();
		  switch(opcao)
		  {
		  case 1:
			  System.out.println("Digite o valor a ser depositado: ");
			  valor = scanner.nextDouble();
			  saldo = saldo + valor;
			  break;
			  
		  case 2:
			  System.out.println("Digite o valor a ser sacado: ");
			  valor = scanner.nextDouble();
			  if(valor <= saldo)
			  {
				  saldo = saldo - valor;
				  System.err.println("Saque realizado com sucesso :)\n");
			  }
			  else
			  {
				  System.out.println("Saldo insuficiente para realizar o saque.\n");
			  }
			  break;
			  
		  case 3:
			  System.out.println("\nSeu saldo atual é: " + saldo);
			  break;
			  
		  case 4:
			  System.out.println("Saindo, obrigado por usar o caixa eletronico :)");
			  break;
			  
			  default:
				  System.out.println("Opção inválida, tente novamente :(\n");
			  
			   scanner.close();
			  
			  
		  }
		}
		
		
	}

}
