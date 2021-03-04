import java.util.Scanner;
public class arrays75 {

	public static void main(String[] args) {
		int [] numeros=new int[250];
		Scanner valor=new Scanner(System.in);
		int maxim,cont=1,posicio=0;;
		boolean continuar=true,repetit=false;
		System.out.println("Introduce un numero");
		numeros[0]=valor.nextInt();
		maxim=numeros[0];
		while (continuar==true) {
			repetit=false;
			System.out.println("Introduce un numero");
			numeros[cont]=valor.nextInt();
			if (numeros[cont]==-999) {
				continuar=false;
			}
			for(int cont2=0;cont2<cont;cont2++) {
				if (numeros[cont]==numeros[cont2] && cont2!=cont) {
					repetit=true;
				}
			}
			if (repetit==false){
			if (numeros[cont]>maxim) {
				maxim=numeros[cont];
				posicio=cont;
				}
			cont++;
			}
			else {
				System.out.println("Numero introduit repetit");
			}
		}
		System.out.println("El numero més gran es "+maxim+" i es troba en la posicio "+posicio+ " de l'array");
	}

}
