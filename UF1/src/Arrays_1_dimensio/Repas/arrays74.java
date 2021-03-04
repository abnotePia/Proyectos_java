package Arrays_1_dimensio.Repas;
import java.util.Scanner;
public class arrays74 {

	public static void main(String[] args) {
		int [] taula1;
		int [] taula2;
		Scanner valor=new Scanner(System.in);
		int n;
		System.out.println("Introduce cuantos numeros quieres");
		n=valor.nextInt();
		taula1=new int[n];
		taula2=new int[n];
		for (int cont=0;cont<n;cont++) {
			System.out.println("Introduce un numero");
			taula1[cont]=valor.nextInt();
			}
		System.out.println("Taula invertida");
		for (int cont=0, i=n-1;cont<n;cont++,i--) {
			taula2[i]=taula1[cont];
		}
		for (int cont=0;cont<n;cont++) {
			System.out.println(taula2[cont]);
		}
		valor.close();
	}

}
