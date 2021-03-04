import java.util.Scanner;
public class bucle49 {

	public static void main(String[] args) {
	int haltura,cont,n,numero,p;
	numero=1;
	cont=1;
	n=0;
	p=0;
	Scanner valor=new Scanner(System.in);
	System.out.println("Introduce el numero de filas que tendra el triangulo de Floyd: ");
	haltura=valor.nextInt();
	while (cont<=haltura) {
			while (n<numero) {
				p=p+1;
				System.out.print(p);
				n=n+1;
			}
		System.out.println("");
		numero=numero+1;
		n=0;
	cont++;	
	}

	}

}
