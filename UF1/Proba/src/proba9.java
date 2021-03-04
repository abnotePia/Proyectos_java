import java.util.Scanner;

public class proba9 {

	public static void main(String[] args) {
		int [] numero;
		int [] perfectes;
		int suma=0,maxim=0;
		boolean continuar=true;
		int n=0,cont=0,cont3=1;
		Scanner valor=new Scanner(System.in);
		//n=valor.nextInt();
		while(continuar==true) {
			suma=0;
			cont3=1;
			n++;
			System.out.println("Introduce un numero: ");
			numero=new int[n];
			perfectes=new int[n];
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
					perfectes[cont]=numero[cont];
				}
				if (perfectes[cont]>maxim) {
					maxim=perfectes[cont];
				}
			}
				cont++;
				if (continuar==false) {
					System.out.println("Els numeros perfectes són: ");
					cont=0;
					while(cont<n) {
					System.out.println(perfectes[cont]);
					cont++;
					}
					System.out.println("El numero perfecto más grande es: "+maxim);
				}
		} 
	}

}
