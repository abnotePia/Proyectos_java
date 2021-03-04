package Inicio;
import java.util.Scanner;
public class AnysDiesSegons {
	public static void main(String[] args) {
		int anys, dies,segons;
		String Anys,Dies,Segons;
		Anys="Introduce tu edad en años: ";
		Dies="Tu edad en dias es: ";
		Segons= "Tu edad en segundos es: ";
		Scanner valor= new Scanner(System.in);
		System.out.println(Anys);
		anys= valor.nextInt();
		dies=365*anys;
		segons=3600*24*365*anys;
		System.out.println(Dies+dies);
		System.out.println(Segons+segons);
	}

}
	