import java.util.Scanner;
public class array71 {

	public static void main(String[] args) {
		/*.Donada una taula de n elements d‟enters introduïts per l‟usuari, fer un algoritme que ens digui la
		suma total dels elements de la taula.*/
		int []numero;
		int n,cont=0,suma=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce cuantos numeros quieres poner: ");
		n=valor.nextInt();
		numero=new int[n];
		while (cont<n) {
			System.out.println("Introduce un numero: ");
			numero[cont]=valor.nextInt();
			suma=suma+numero[cont];
			cont++;
		}
		System.out.println("La suma de tots els numeros es: "+suma);
		valor.close();
	}

}
