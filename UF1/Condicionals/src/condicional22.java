import java.util.Scanner;
public class condicional22 {

	public static void main(String[] args) {
		double x,a,b;
		Scanner valor=new Scanner(System.in);
		System.out.println("Teniendo en cuenta que x=10*a/b ");
		System.out.println("Introduce el valor de a: ");
		a=valor.nextDouble();
		System.out.println("Introduce el valor de b: ");
		b=valor.nextDouble();
		if (b==0) {
			System.out.println("No es posible hacer esta operación");
		}
		else {
			x=10*a/b;
			System.out.println("El valor de x es: "+x);
		}
	}
}
