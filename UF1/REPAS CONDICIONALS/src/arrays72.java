import java.util.Scanner;

public class arrays72 {

	public static void main(String[] args) {
	int [] numeros;
	int n,positivo=0,negativo=0,neutro=0;
	Scanner valor=new Scanner(System.in);
	System.out.println("Introduce cuantos numeros quieres introducir");
	n=valor.nextInt();
	numeros=new int[n]; 
	for(int cont=0;cont<n;cont++) {
		System.out.println("Introduce un numero");
		numeros[cont]=valor.nextInt();
		if (numeros[cont]<0) {
			negativo++;
		}
		else if(numeros[cont]>0) {
			positivo++;
		}
		else {
			neutro++;
		}
	}
	System.out.println("Hi han "+negativo+" numeros negativos\nHi han "+positivo+" numeros positivos\nHi han "+neutro+" numeros neutros");
	}

}
