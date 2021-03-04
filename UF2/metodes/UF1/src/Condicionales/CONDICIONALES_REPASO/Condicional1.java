package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;
public class Condicional1 {

	public static void main(String[] args) {
		int opcio;
		float numero1,numero2,resultat;
		Scanner valor=new Scanner(System.in);
		System.out.println("Elige que opcion quieres: ");
		System.out.println(" [1] Suma\n [2] Resta\n [3] Multiplicació\n [4] Divisió\n");
		opcio=valor.nextInt();
		System.out.println("Introdueix el primer numero: ");
		numero1=valor.nextFloat();
		System.out.println("Introdueix el segon numero: ");
		numero2=valor.nextFloat();
		switch (opcio) {
		
		case 1:
			resultat=numero1+numero2;
			System.out.println("El resultat de la operacio:\n"+numero1+" + "+ "numero2 "+" = "+resultat);
			break;
		case 2:
			resultat=numero1-numero2;
			System.out.println("El resultat de la operacio:\n"+numero1+" - "+ "numero2 "+" = "+resultat);
			break;
		case 3:
			resultat=numero1*numero2;
			System.out.println("El resultat de la operacio:\n"+numero1+" * "+ "numero2 "+" = "+resultat);
			break;
		case 4:
			if (numero2!=0) {
			resultat=numero1/numero2;
			System.out.println("El resultat de la operacio:\n"+numero1+" / "+ "numero2 "+" = "+resultat);
			}
			else {
				System.out.println("DIV PER 0");
			}
			break;
			default: 
				System.out.println("OPERACIO NO VALIDA");
				break;
		}
		valor.close();
	}

}
