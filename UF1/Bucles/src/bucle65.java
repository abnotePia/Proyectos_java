import java.util.Scanner;
public class bucle65 {
	public static void main(String[] args) {
	int num, cont,numVariables;
	num=0;
	cont=0;
	numVariables=0;
	do {
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		num=valor.nextInt();
		if (num>0) {
			cont=cont+num;
			numVariables++;
		}
	}while(num!=0);
	System.out.println("La mitjana d'aquesta seqüencia es: "+cont/numVariables);
	}

}
