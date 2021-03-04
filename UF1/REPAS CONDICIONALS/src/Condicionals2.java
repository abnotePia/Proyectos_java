import java.util.Scanner;
public class Condicionals2 {

	public static void main(String[] args) {
		int c1,c2,devolber;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el valor de la carta: ");
		c1=valor.nextInt();
		System.out.println("Introduce el valor de la carta: ");
		c2=valor.nextInt();
		if ((c1<1 || c1>10) || (c2<1||c2>10) ) {
			devolber=-1;
		}
		else if (c1==c2) {
			devolber=0;
		}
		else if ((c1-1==c2 || c1+1==c2)&& (c2-1==c1||c2+1==c1)) {
			devolber=1;
		}
		else {
			devolber=2;
		}
		System.out.println(devolber);
		valor.close();
	}

}
