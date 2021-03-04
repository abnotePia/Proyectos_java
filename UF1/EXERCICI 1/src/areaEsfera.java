import java.util.Scanner;

public class areaEsfera {
	static final double PI=3.1416;

	public static void main(String[] args) {
		double radi,A;
		String Radi,Area;
		Radi="Introduce el valor del radio: ";
		Area="El area de la esfera es: ";
		Scanner valor=new Scanner(System.in);
		System.out.println(Radi);
		radi=valor.nextFloat();
		A= (4*PI)*(radi*radi);
		System.out.println(Area+A);
	}
}
