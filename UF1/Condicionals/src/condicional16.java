import java.util.Scanner;
public class condicional16 {

	public static void main(String[] args) {
	Scanner valor= new Scanner(System.in);
	double valor1,valor2;
	System.out.println("Introduce el primer numero:");
	valor1= valor.nextDouble();
	System.out.println("Introduce el segundo numero:");
	valor2= valor.nextDouble();
	if (valor1<valor2) {
	System.out.println("El numero "+valor2+" es mas grande que "+valor1);
	}
	else {
		System.out.println("El numero "+valor1+" es mas grande que "+valor2);
	}
}
}