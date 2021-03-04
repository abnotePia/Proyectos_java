import java.util.Scanner;
public class bucle43 {
	public static void main(String[] args) {
		int numeros,mesgran,mespetit,itineracio;
		double mitjana;
		mitjana=0;
		mesgran=0;
		mespetit=0;
		itineracio=0;
		Scanner valor=new Scanner(System.in);
		do {
			System.out.println("Introduce un numero: ");
			numeros=valor.nextInt();
			if (numeros>=mesgran) {
				mesgran=numeros;
			}
			else if (numeros<=mespetit && numeros!=0) {
				mespetit=numeros;
			}
			mitjana=mitjana+numeros;
			itineracio=itineracio+1;
		}while(numeros!=0);
		System.out.println("De la sequencia el numero més gran es el numero "+mesgran+" i el més petit es el numero "+mespetit+ "."+" La mitjana aritmetica es: "+(mitjana/itineracio));
	}

}
