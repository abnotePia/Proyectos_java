import java.util.Scanner;
public class calculaSuma {

	public static void main(String[] args) {
	float numero1,numero2,resultat;
	String introducirvalor, Resultat;
	introducirvalor= "Introdueix el valor: ";
	Resultat="El resultat de la suma es: ";
	Scanner entrada = new Scanner(System.in);
	System.out.println(introducirvalor);
	numero1= entrada.nextFloat();
	System.out.println(introducirvalor);
	numero2= entrada.nextInt();
	
	resultat= numero1+numero2;
	System.out.println(Resultat+resultat);
	}
}
