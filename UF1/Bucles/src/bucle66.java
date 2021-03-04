import java.util.Scanner;
public class bucle66 {

	public static void main(String[] args) {
		int numero,n;
		boolean continuar;
		continuar=true;
		n=1;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		numero=valor.nextInt();
		System.out.println("Els divisors de "+numero+" son: ");
		do {
			int numero1=(int)(Math.random()*(n-n+1))+n;
			if (numero%numero1==0) {
				System.out.println(numero1);
			}
			if (n>=numero) {
				continuar=false;
			}
			n++;
		}while (continuar!=false);
	

	}
}
