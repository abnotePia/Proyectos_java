import java.util.Scanner;
public class dddddd3 {

	public static void main(String[] args) {
		int factorial;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce que numero quieres para hacer el factorial");
		factorial=valor.nextInt();
		System.out.println("El factorial del numero "+factorial+" es:");
		System.out.print(factorial+"!= ");
		int numero=factorial;
		for (int cont=factorial;0<cont;cont--) {
			if (cont>1) {
			System.out.print(cont+"*");
			numero=(cont-1)*numero;
			}
			else {
				System.out.print(cont);
			}
		}
		System.out.println("="+numero);
		valor.close();
	}

}
