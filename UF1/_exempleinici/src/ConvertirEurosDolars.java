import java.util.Scanner;
public class ConvertirEurosDolars {

	public static void main(String[] args) {
		double euros,dolars;
		String Dolars, Euros;
		Euros="El numero d'euros es: ";
		Dolars="Introdueix els dolars que vols convertir a euros: ";
		Scanner valor= new Scanner(System.in);
		System.out.println(Dolars);
		dolars= valor.nextDouble();
		euros=dolars*0.85;
		System.out.println(Euros+euros);
	}

}
