package Condicionales;
import java.util.Scanner;
public class condicional32 {

	public static void main(String[] args) {
		double dinersTotals,horesExtres,diners,horesExtres2;
		Scanner valor=new Scanner(System.in);
		dinersTotals=0;
		System.out.println("Introdueix el numero de hores extres que fas a la setmana: ");
		horesExtres=valor.nextDouble();
		System.out.println("Introdueix el que cobres per cada hora: ");
		diners=valor.nextDouble();
		if (horesExtres<=8) {
			dinersTotals= horesExtres* (2*diners);
		}
		else if(horesExtres>=8) {
			horesExtres2=horesExtres-8;
			horesExtres=8;
			dinersTotals= horesExtres*(2*diners)+horesExtres2*(3*diners);
		}
		System.out.println("Cobraras "+dinersTotals+" de horas extres a la setmana");
	}

}
