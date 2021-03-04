import java.util.Scanner;
public class proba7 {

	public static void main(String[] args) {
		// maxim comu divisor
		int n,m;
		double residu;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		n=valor.nextInt();
		System.out.println("Introduce un numero: ");
		m=valor.nextInt();
		
	do { 
		residu=m%n;
		if (residu==0.0) {
			System.out.println("El maxim comu divisor es: "+n);
		}
		else {
			m/=n;
			n/=residu;
		}
	}while(residu!=0);
}

}
