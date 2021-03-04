package Arrays_1_dimensio;
import java.util.Scanner;
public class Array80 {

	public static void main(String[] args) {
		int [] numero;
		int [] perfectes;
		int suma=0,maxim=0;
		boolean continuar=true;
		int n,cont=0,cont2=0,cont3=1;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la longuitud de la arrray: ");
		n=valor.nextInt();
		numero=new int[n];
		perfectes=new int[n];
		while(continuar==true && cont<n) {
			suma=0;
			cont3=1;
			System.out.println("Introduce un numero: ");
			numero[cont]=valor.nextInt();
			if (numero[cont]==0) {
				continuar=false;
			}
			else {
			while (cont3!=numero[cont]) {
				if (numero[cont]%cont3==0) {
					if (numero[cont]!=cont3) {
					suma=suma+cont3;
					}
				}
				cont3++;
			}
				if (numero[cont]==suma) {
					perfectes[cont2]=numero[cont];
				}
				if (perfectes[cont2]>maxim) {
					maxim=perfectes[cont2];
				}
			}
				cont++;
				cont2++;
		} 
		cont=0;
		System.out.println("Els numeros perfectes són: ");
		while (cont<n) {
			System.out.println(perfectes[cont]);
			cont++;
		}
		valor.close();
		System.out.println("El numero perfecto más grande es: "+maxim);
	}

}
