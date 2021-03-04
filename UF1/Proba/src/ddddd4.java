import java.util.Scanner;
public class ddddd4 {

	public static void main(String[] args) {
		int numero,divisor,numeros=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el numero de divisores quieres");
		numero=valor.nextInt();
		System.out.println("De que numero quieres saber sus divisores");
		divisor=valor.nextInt();
		System.out.println("Els "+numero+" primers numeros divisibles de "+divisor+" son:");
		for (int cont=1;cont<=numero;cont++) {
			System.out.print(numeros+" ");
			numeros+=divisor;
		}
		valor.close();
	}

}
