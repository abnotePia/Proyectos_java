import java.util.Scanner;
public class condicional5 {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		int numero,mitjana=0;
		for(int cont=0;cont<10;cont++) {
			System.out.println("Introduce un numero: ");
			numero=valor.nextInt();
			mitjana+=numero;
		}
		System.out.println("La media es: "+mitjana/10);
		valor.close();
	}

}
