package Inicio;
import java.util.Scanner;
public class AreaTriangle {

	public static void main(String[] args) {
	float h,b,A;
	String altura,base,Area;
	altura="Introduce el valor de la altura: ";
	base="Introduce el valor de la base: ";
	Area="El triangulo tiene una area: ";
	Scanner valor= new Scanner(System.in);
	System.out.println(altura);
	h=valor.nextFloat();
	System.out.println(base);
	b= valor.nextFloat();
	A= (h*b)/2;
	System.out.println(Area+A);
	}
}
