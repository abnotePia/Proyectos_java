package Inicio;
import java.util.Scanner;
public class intercanviVariables {

	public static void main(String[] args) {
		float variable1,variable2,Variable1,Variable2;
		String elegirValor, intercambio,intercambio2;
		elegirValor="Introduce el valor de la variable: ";
		intercambio= "El nuevo valor de la variable dos es: ";
		intercambio2="El nuevo valor de la variable uno es: ";
		Scanner valor= new Scanner(System.in);
		System.out.println(elegirValor);
		variable1= valor.nextFloat();
		System.out.println(elegirValor);
		variable2= valor.nextFloat();
		Variable1=variable1;
		Variable2=variable2;
		Variable1=variable2;
		Variable2=variable1;
		System.out.println(intercambio+Variable2);
		System.out.println(intercambio2+Variable1);
		
		
	}

}
