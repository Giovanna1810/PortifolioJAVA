import java.util.Scanner;
public class EstruturaCondicional {
public static void main (String[]arg) {
Scanner scanner = new Scanner (System.in); 
System.out.println("bom dia, boa tarde, boa noite:");
String valor = scanner.nextLine();

 if (valor.equalsIgnoreCase ("boa tarde")) {
	 
	 System.out.println("boa tarde");
 }
 
 else if (valor.equals("bom dia"))  {
	 
	 System.out.println("bom dia");
 }
 
 else {
	 System.out.println("Boa noite");
 }
 
 }
}
