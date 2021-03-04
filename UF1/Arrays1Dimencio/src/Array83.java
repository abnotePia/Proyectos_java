import java.util.Scanner;

public class Array83 {

	public static void main(String[] args) {
		int [] numeros;
		int [] repetit;
		boolean repetir=true;
		Scanner valor=new Scanner(System.in);
		int llarg,cont=0,cont2=0;
		System.out.println("Introduce la longuitud de la array: ");
		llarg=valor.nextInt();
		numeros=new int[llarg];
		repetit=new int[llarg];
		while (cont<llarg) {
			repetir=true;
			System.out.println("Introduce un numero: ");
			numeros[cont]=valor.nextInt();
			cont2=0;
			while (cont2<llarg) {
				if (numeros[cont]==numeros[cont2]) {
					repetit[cont]++;
				}
				cont2++;
			}
			cont2=0;
			while (cont2<llarg) {
				if (numeros[cont]==numeros[cont2] && repetir==true) {
					System.out.println("El numero "+numeros[cont]+" ha sigut introduit "+repetit[cont]+" vegades");
					repetir=false;
				}
				cont2++;
			}
			
			cont++;
			
		}
		valor.close();

	}

}
