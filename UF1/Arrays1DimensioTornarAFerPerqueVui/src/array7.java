import java.util.Scanner;
public class array7 {

	public static void main(String[] args) {
		int[] temperaturas;
		int dias,grans=0,iguals=0,menors=0;
		float mitjana=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el numero de dias: ");
		dias=valor.nextInt();
		temperaturas=new int[dias];
		for (int cont=0;cont<dias;cont++) {
			System.out.println("Introduce una temperatura: ");
			temperaturas[cont]=valor.nextInt();
			mitjana+=temperaturas[cont];
		}
		mitjana/=dias;
		for (int cont=0;cont<dias;cont++) {
			if (temperaturas[cont]<mitjana) {
				menors++;
			}
			else if (temperaturas[cont]>mitjana) {
				grans++;
			}
			else {
				iguals++;
			}
		}
		System.out.println("Hay "+menors+" de temperaturas menores a la media "+mitjana);
		System.out.println("Hay "+iguals+" de temperaturas iguales a la media "+mitjana);
		System.out.println("Hay "+grans+" de temperaturas superiores a la media "+mitjana);
	}

}
