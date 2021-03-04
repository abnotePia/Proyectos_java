package Arrays_1_dimensio.Repas;
import java.util.Scanner;
public class Array5 {

	public static void main(String[] args) {
		int []numeros;
		int cont=0,max=0,posicio=0;
		boolean continuar=true;
		Scanner valor=new Scanner(System.in);
		numeros=new int[999];
		System.out.println("Si no vols introduir més numeros introdueix el numero -999");
		while (continuar==true) {
			System.out.println("Introdueix un numero: ");
			numeros[cont]=valor.nextInt();
			if (cont==0) {
				max=numeros[cont];
			}
			for (int cont2=0; cont2<999;cont2++) {
				if (numeros[cont]==numeros[cont2] && cont!=cont2) {
					System.out.println("Numero repetit introdueix un altre numero: ");
					numeros [cont]=valor.nextInt();
					cont2=0;
				}
			}
			if (numeros[cont]>max) {
				max=numeros[cont];
				posicio=cont;
			}
			if (numeros[cont]==-999) {
				continuar=false;
			}
			cont++;
		}
		valor.close();
		System.out.println("El valor maxim es "+max+" que es trova en la posicio "+posicio+" de la array");
	}

}
