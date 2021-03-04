import java.util.Scanner;
public class array77 {

	public static void main(String[] args) {
		/*Tenim N temperatures guardades en una taula, Calcular la mitja i obtenir el número de
		temperatures més grans o iguals a la mitja.*/
		int [] temperaturas;
		int [] majors;
		int [] menors;
		int [] Iguals;
		double mitjana=0;
		int longuitud,cont=0,petits=0,grans=0,iguals=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introdueix el numero de temperaturas que vols introducir: ");
		longuitud=valor.nextInt();
		temperaturas=new int[longuitud];
		majors=new int [longuitud];
		menors=new int[longuitud];
		Iguals=new int [longuitud];
		while (cont<longuitud) {
			System.out.println("Introdueix una temperatura: ");
			temperaturas[cont]=valor.nextInt();
			mitjana=mitjana+temperaturas[cont];
			cont++;
		}
		mitjana/=longuitud;
		cont=0;
		while (cont<longuitud) {
			if (temperaturas[cont]<mitjana) {
				petits++;
				menors[cont]=temperaturas[cont];
			}
			else if (temperaturas[cont]>mitjana) {
				grans++;
				majors[cont]=temperaturas[cont];
			}
			else {
				Iguals[cont]=temperaturas[cont];
				iguals++;
			}
			cont++;
		}
		valor.close();
		System.out.println("Hi han "+petits+" temperaturas més petites que la mitja "+mitjana+" i aquestes són: ");
		cont=0;
		while (cont<longuitud) {
			if (menors[cont]==temperaturas[cont]) {
			System.out.println(menors[cont]);
			}
			cont++;
			
		}
		cont=0;
		System.out.println("Hi han "+grans+" temperaturas més grans que la mitja "+mitjana+" i aquestes són: ");
		while (cont<longuitud) {
			if (majors[cont]==temperaturas[cont]) {
			System.out.println(majors[cont]);
			}
			cont++;
		}
		cont=0;
		System.out.println("Hi han "+iguals+" temperaturas iguals que la mitja "+mitjana+" i aquestes són: ");
		while (cont<longuitud) {
			if (Iguals[cont]==temperaturas[cont]) {
			System.out.println(Iguals[cont]);
			}
			cont++;
		}
		
	}

}
