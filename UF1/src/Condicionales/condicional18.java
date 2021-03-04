package Condicionales;
import java.util.Scanner;
public class condicional18 {

	public static void main(String[] args) {
		int numero1,numero2,numero3,numero4,resultat1,resultat2;
		Scanner valor= new Scanner(System.in);
		System.out.println("Introduce el primer numero entero: ");
		numero1=valor.nextInt();
		System.out.println("Introduce el segundo numero entero: ");
		numero2=valor.nextInt();
		resultat1= numero1+numero2;
		System.out.println("Introduce el tercer numero entero: ");
		numero3=valor.nextInt();
		System.out.println("Introduce el cuarto numero entero: ");
		numero4=valor.nextInt();
		resultat2= numero3+numero4;
		if (resultat1<resultat2) {
			System.out.println("La suma dels dos primers es més petit que la suma dels dos segons");
		}
		else if (resultat1>resultat2) {
			System.out.println("La suma dels dos primers es més gran que la suma dels dos segons");
		}
		else {
			System.out.println("La suma dels dos primers es igual que la suma dels dos segons");
		}
	}
}
