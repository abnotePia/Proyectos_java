import java.util.Scanner;
public class proba {
//Fibonacci
	public static void main(String[] args) {
		int fibonachi, suma=0, sumaantiga=0, cont=1,valor1=1,valor2=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la longuitud de la serie de fibonachi: ");
		fibonachi=valor.nextInt();
		while(cont<=fibonachi) {
				sumaantiga=suma;
				suma=valor1+valor2;
				valor1=suma;
				valor2=sumaantiga;
			System.out.print(" "+suma);
			cont++;
		}
		valor.close();
	}
}
