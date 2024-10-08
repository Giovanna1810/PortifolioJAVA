import java.util.Scanner;
public class ConversorDolarReal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do dolar atualmente: ");
		double dolar = sc.nextDouble();
		
		System.out.println("Digite uma valor em dólares: ");
		double valor_em_dolar = sc.nextDouble();
		
		double real = valor_em_dolar * dolar;
		
		System.out.printf("O valor em real é: R$ %.2f%n", real);

	}

}
