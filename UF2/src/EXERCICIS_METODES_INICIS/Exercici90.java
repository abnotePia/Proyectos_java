package EXERCICIS_METODES_INICIS;
import java.util.Scanner;

public class Exercici90 {

	public static void main(String[] args) {
		Exercici90 p=new Exercici90();
		p.principal();
	}
	public void principal() {
		Scanner valor=new Scanner(System.in);
		int [] numeros=new int [250];
		int cont=0,num=0;
		do {
			numeros[cont]=LlegirNumeros(cont,valor);
			cont++;
		} while (numeros[cont-1]!=0);
		double mitja=mitjana(numeros,num);
		System.out.println("El numero más grande es "+mesGran(numeros)+" el numero más pequeño es "+mesPetit(numeros));
		System.out.println("La media es "+mitja+" y hay "+numesgran(mitja,numeros,num)+" numeros mas grandes");
		valor.close();
		
	}
	public int LlegirNumeros(int cont,Scanner valor) {
		System.out.println("Introduce un numero: ");
		int numero=valor.nextInt();
		return numero;
	}
	public int mesGran(int [] numeros) {
		int max=0,cont=0;
		while (numeros[cont]!=0) {
			if (cont==0) {
				max=numeros[cont];
			}
			else if (max<numeros[cont]) {
				max=numeros[cont];
			}
			cont++;
		}
		return max;
	}
	
	public int mesPetit(int [] numeros) {
		int min=0,cont=0;
		while (numeros[cont]!=0) {
			if (cont==0) {
				min=numeros[cont];
			}
			else if (min>numeros[cont]) {
				min=numeros[cont];
			}
			cont++;
		}
		return min;
	}
	public double mitjana(int [] numeros,int num) {
		double mitja=0;
		int cont=0;
		while (numeros[cont]!=0) {
			mitja+=numeros[cont];
			cont++;
		}
		mitja/=cont;
		return mitja;
	}
	public int numesgran(double mitja,int [] numeros,int num) {
		int cont=0;
		while (numeros[cont]!=0) {
			if (numeros[cont]>mitja) {
				num++;
			}
			cont++;
		}
		return num;
	}
}
