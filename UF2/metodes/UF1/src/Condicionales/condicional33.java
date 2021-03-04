package Condicionales;
import java.util.Scanner;
public class condicional33 {
	public static void main(String[] args) {
		double salari,benefici;
		int antiguitat;
		Scanner valor=new Scanner(System.in);
		benefici=0;
		System.out.println("Introduce el salario mensual: ");
		salari=valor.nextDouble();
		System.out.println("Introduce la antiguedad: ");
		System.out.println("[1] Menos de 1 año");
		System.out.println("[2] 1 año o más y menos de 2 años");
		System.out.println("[3] 2 años o más y menos de 5 años");
		System.out.println("[4] 5 años o más y menos de 10 años");
		System.out.println("[5] 10 años o más");
		System.out.println("Introduce un valor entre [1-5]");
		antiguitat=valor.nextInt();
		switch(antiguitat) {
		case 1:
			benefici= salari*0.05;
			break;
		case 2:
			benefici= salari*0.07;
			break;
		case 3:
			benefici= salari*0.1;
			break;
		case 4:
			benefici= salari*0.15;
			break;
		case 5:
			benefici= salari*0.2;
			break;
		}
		System.out.println("Su beneficio anual es de: "+benefici+" euros");
	}
}
