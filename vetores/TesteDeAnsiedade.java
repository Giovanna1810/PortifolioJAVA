/*Crie um porgrama chamado teste de ansiedade onde o usuário responderá 10 
 * perguntas específicas para o resultado final. O usuário pode responder 
 * apenas 'Sim' ou 'Não' para cada pergunta. As perguntas específicas são: */
//Você se sente com dificuldade de concentração?
//Você se sente cansado facilmente?
//Tem dificuldades em adormecer ou permanecer a dormir?
//Você se preocupa muito com o futuro?
//Tem dificuldade em relaxar?
//Sentiu-se tão preocupado que foi dificil ficar parado?
//Sentiu-se facilmente irritável ou chateado?
//Sentiu medo como se algo muito ruim fosse acontecer?
//Você se preocupa com a opinião dos outros?
//Você está com dificuldades em lembrar os detalhes?

import java.util.Scanner;
public class TesteDeAnsiedade {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String resposta;
	int i = 0;
	
	
	String [] perguntas  = {"1. Você se sente com dificuldade de concentração?",
			"2. Você se sente cansado facilmente?\n",
			"3. Tem dificuldades em adormecer ou permanecer a dormir?\n",
		    "4. Você se preocupa muito com o futuro?\n",
		    "5. Tem dificuldade em relaxar?\n",
			"6. Sentiu-se tão preocupado que foi dificil ficar parado?\n",
			"7. Sentiu-se facilmente irritável ou chateado?\n",
			"8. Sentiu medo como se algo muito ruim fosse acontecer?\n",
			"9. Você se preocupa com a opinião dos outros?\n",
			"10. Você está com dificuldades em lembrar os detalhes?\n"};
	
	
	System.out.println("=== Boas vindas ao Teste de Ansiedade ===" + "\n" 
	+"Você responderá 10 perguntas com apenas 'Sim ' ou 'Não'." + "\n" 
	+ "Bom teste.");
	
	
	for(String pergunta : perguntas )
	{
		System.out.println(pergunta);
		resposta = scanner.nextLine();
		if(resposta.equalsIgnoreCase("sim"))
		{
		  	 i++;
		}
		
	}
	if(i >= 7)
	{
		System.out.println("Você possui forte indícios de ansiedade. Faça terapia.");
	}
	
	else if(i < 5)
	{
		System.out.println("Você está aparentemente bem e sem riscos de ansiedade.");
	}
	
	else
	{
		System.out.println("Você precisa cuidar do corpo e da mente. Procure orientação médica.");
	}
	
	
	
	}

}
