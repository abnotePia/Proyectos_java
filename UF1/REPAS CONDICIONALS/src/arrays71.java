import java.util.Scanner;
public class arrays71 {

	public static void main(String[] args) {
		int [] numeros;
		int n,sum=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce cuantos numeros quieres introducir");
		n=valor.nextInt();
		numeros=new int[n]; 
		for(int cont=0;cont<n;cont++) {
			System.out.println("Introduce un numero");
			numeros[cont]=valor.nextInt();
			sum+=numeros[cont];
		}
		System.out.println("La suma de todos los numeros es: "+sum);
	}

}
