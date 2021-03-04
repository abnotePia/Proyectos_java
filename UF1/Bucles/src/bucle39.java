import java.util.Scanner;
public class bucle39 {

	public static void main(String[] args) {
		int i,numero;
		double mitjana ;
		i=1;
		numero=0;
		mitjana=0;
		Scanner valor=new Scanner(System.in);
		while (i<=10) {
			System.out.println("Introduce un numero: ");
			numero=valor.nextInt();
			mitjana=mitjana+numero;
			i=i+1;
		}
		System.out.println("La media aritmetica de los 10 numeros es: "+mitjana/10);
	}

}
