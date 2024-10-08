
public class Exemplo_Array {

	public static void main(String[] args) {
		int[] numeros;
		
		numeros = new int [5];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println("Elemento na posição " + i + ": " + numeros[1]);
		}
		
		int primeiro_elemento = numeros[0];
		System.out.println("Primeiro elemento: " + primeiro_elemento);
		
		String[] nomes = { "Maria", "João", "Alice", "Diane"};
		
		String terceiro_elemento = nomes[3];
		System.out.println("Terceiro elemento: " + terceiro_elemento);
		
		for(String nome : nomes)
		{
			System.out.println("Nome: " + nome);
		}

	}

}
