import java.util.Scanner;
public class bucle48 {

	public static void main(String[] args) {
		int n,costat1,costat2;
		char asterisc;
		costat1=1;
		costat2=1;
		asterisc='*';
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el tamaño del lado del cuadrado: ");
		n=valor.nextInt();
		while(costat2<=n) {
			while (costat1<=n) {
				System.out.print(asterisc);
				costat1++;
			}
			System.out.println("");
			costat2++;
			costat1=1;
		}
	}

}
