import java.util.Scanner;
public class condicional16 {

	public static void main(String[] args) {
		int llarg=3,suma=0,sumaanterior=1,anterior=1;
		boolean correcte=false;
		Scanner valor=new Scanner(System.in);
		while (correcte==false) {
		System.out.println("Introduce la longuitud de la serie fibonachi");
		llarg=valor.nextInt();
		if (llarg>2) {
			correcte=true;
		}
		else {
			System.out.println("La longuitud de la serie es insuficiente prueba otro");
		}
		}
		for (int cont=0; cont<llarg;cont++) {
			if (cont==0 | cont==1) {
				System.out.print(" "+"1"+" ");
				suma=1;
			}
			else {
			anterior=suma;
			suma=anterior+sumaanterior;
			sumaanterior=anterior;
			System.out.print(" "+suma+" ");
			}
		}
		valor.close();
	}

}
