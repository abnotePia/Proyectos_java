import java.util.Scanner;
public class condicional23 {

	public static void main(String[] args) {
		double b,h,area,perimetro;
		int eleccio;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la altura: ");
		h=valor.nextDouble();
		System.out.println("Introduce la base: ");
		b=valor.nextDouble();
		System.out.println("[1] Calcular area");
		System.out.println("[2] Calcular perimetro");
		System.out.println("Elige la opcion [1] o [2]");
		eleccio=valor.nextInt();
		switch (eleccio) {
		case 1:
			area=b*h;
			System.out.println("El area del rectangulo es: "+area);
			break;
		case 2:
			perimetro=2*b+2*h;
			System.out.println("El perimetro del rectangulo es: "+perimetro);
			break;
		}
		
	}

}
