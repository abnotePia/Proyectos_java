import java.util.Scanner;
public class condicional21 {

	public static void main(String[] args) {
	int a,b,c;
	Scanner valor=new Scanner(System.in);
	System.out.println("Introduce el valor del primer numero: ");
	a=valor.nextInt();
	System.out.println("Introduce el valor del segundo numero: ");
	b=valor.nextInt();
	System.out.println("Introduce el valor del tercer numero: ");
	c=valor.nextInt();
	if (a<b && a<c) {
		if (b<c) {
			System.out.println("El primer valor "+c+" el segon valor "+b+" el tercer valor "+a);
		}
		else {
			System.out.println("El primer valor "+b+" el segon valor "+c+" el tercer valor "+a);
		}
	}
	if (b<a && b<c) {
		if (a<c) {
			System.out.println("El primer valor "+c+" el segon valor "+a+" el tercer valor "+b);
		}
		else {
			System.out.println("El primer valor "+a+" el segon valor "+c+" el tercer valor "+b);
		}
	}
	if (c<a && c<b) {
		if (a<b) {
			System.out.println("El primer valor "+b+" el segon valor "+a+" el tercer valor "+c);
		}
		else {
			System.out.println("El primer valor "+a+" el segon valor "+b+" el tercer valor "+c);
		}
	}
	}
}
