import java.util.Scanner;
public class condicional31 {
	public static final int MIN=100;
	public static final double DES=0.05;
	public static final int MAX=30;
	public static void main(String[] args) {
		double preu, descompte,preuFinal;
		preuFinal=0;
		descompte=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el precio: ");
		preu=valor.nextDouble();
		if (preu>=0) {
			if (preu>=MIN) {
				descompte= preu*DES;
				if(descompte>MAX) {
					descompte=MAX;
				}
			}
			preuFinal=preu-descompte;
			System.out.println("El preu final es: "+preuFinal);
		}
		else {
			System.out.println("Precio no disponibe");
		}
	}

}
