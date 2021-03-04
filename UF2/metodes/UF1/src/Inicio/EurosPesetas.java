package Inicio;
import java.util.Scanner;
public class EurosPesetas {

	public static void main(String[] args) {
	double peseta,euros;
	String Peseta,Euros;
	Peseta="La cantidad introducida en euros son en pesetas: ";
	Euros="Introduce la cantidad de euros a convertir: ";
	Scanner valor=new Scanner(System.in);
	System.out.println(Euros);
	euros=valor.nextDouble();
	peseta= 166.386*euros;
	System.out.println(Peseta+peseta);
	}

}
