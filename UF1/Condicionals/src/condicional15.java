import java.util.Scanner;
public class condicional15 {
	public static void main(String[] args) {
		double x;
		x=0;
	Scanner valor = new Scanner(System.in);
	System.out.println("Introduce un numero:");
	x=valor.nextDouble();
	if (x>0) {
		System.out.println("El numero "+x+" es positivo");
	}
	else if (x<0) {
		System.out.println("El numero "+x+" es negativo");
	}
	else {
		System.out.println("El numero "+x+" es neutro");
	}
	}

}
