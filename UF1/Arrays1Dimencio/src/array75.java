import java.util.Scanner;
public class array75 {

	public static void main(String[] args) {
		/*Donada una taula de n elements enters, buscar el valor màxim, i el lloc on es troba aquest valor,
		tenint en compte que no poden existir valors repetits. Aquests números seran introduïts pel
		teclat validant que no hi hagi duplicacions, finalitzant la sèrie amb el -999.*/
		boolean continuar=true;
		int numero[];
		int max=0,cont=0,repeticio=0;
		Scanner valor=new Scanner(System.in);
		numero=new int[250];
		System.out.println("Para finalizar la introduccion de numeros introducir el numero -999 ");
		while (continuar==true) {
		System.out.println("Introduce un numero: ");
		numero[cont]=valor.nextInt();
		if (cont==0) {
		max=numero[0];
		}
		for(int j=0;j<10;j++){
	          if (numero[cont]==numero[j] && j!=cont) {
	        	 System.out.println("Numero no valido introduce otro: ");
	        	 numero[cont]=valor.nextInt();
	          }
		}
		if (numero[cont]>max) {
			max=numero[cont];
			repeticio=cont+1;
		}
		if (numero[cont]==-999) {
			continuar=false;
		}
		cont++;
		}
		valor.close();
		//Contant que la primera posicio es 1 i no 0 alhora de comptar quan imprimeix per pantalla
		System.out.println("El numero más grande es el "+max+" y se encuentra en la posición "+repeticio);
		
	}

}
