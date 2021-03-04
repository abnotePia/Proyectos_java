package EXEMPLES_CLASE;
import java.util.Scanner;
public class exemple1 {

	public static void main(String[] args) {
		exemple1 e= new exemple1();
		e.principal();
	}
	public void principal() {
		int num1,num2;
		int resultat=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Entra num1: ");
		num1=valor.nextInt();
		System.out.println("Entra num2: ");
		num2=valor.nextInt();
		//Aixo es diu: PAS PARAMETRE PER VALOR
		resultat=suma(num1,num2);//El que envia es una copia dels valors aixo vol dir que
		//el valor de la variable continua en memoria més la copia
		System.out.println("El resultat es "+resultat);
		valor.close();
	}
	//No fa falta posar el mateix nom, el valor de la variable depen de la posicio 
	//si esta en la primera posicio tindra el valor de num1 i si esta en la posicio 2 tindra
	//el valor de num2
	public int suma (int num1,int num2) {
		return(num1+num2);		
	}
}
