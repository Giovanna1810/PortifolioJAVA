import java.util.Scanner;
public class EsroqueMedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade mínima: ");
		double quantidade_minima = sc.nextDouble();
		
		System.out.println("Digite a quantidade máxima");
		double quantidade_maxima = sc.nextDouble();
		
		double estoque_medio = (quantidade_minima + quantidade_maxima)/2;
		
		System.out.println("O estoque médio é: " + estoque_medio);

	}

}
