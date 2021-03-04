package Arrays_1_dimensio.Repas;
import java.util.Scanner;
public class Array6 {

	public static void main(String[] args) {
		int [] numeros;
		int [] parells;
		int [] imparells;
		int llarg;
		boolean imparell=true;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros que quieres introducir: ");
		llarg=valor.nextInt();
		numeros=new int[llarg+1];
		parells=new int [llarg+1];
		imparells=new int[llarg+1];
		for (int cont=0;cont<llarg;cont++) {
			System.out.println("Introduce un numero: ");
			numeros[cont]=valor.nextInt();
			if (numeros[cont]%2==0) {
				parells[cont]=numeros[cont];
			}
			else {
				imparells[cont]=numeros[cont];
			}
		}
			for (int cont=0;cont<llarg;cont++) {
				 if (imparell==true) {
					 if (cont+1>=llarg && llarg%2!=0) {
							imparell=false;
						}
					if (numeros[cont]==imparells[cont]) {
						if (imparell==true && numeros[cont+1]%2==0 && cont+1!=llarg) {
								numeros[cont]=parells[cont+1];
						}
					}
					else {
						numeros[cont]=imparells[cont-1];
					}
				 }
				 valor.close();
				System.out.println(numeros[cont]);
			}
		}
	}


