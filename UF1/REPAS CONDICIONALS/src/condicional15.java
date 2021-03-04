import java.util.Scanner;
public class condicional15 {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		int haltura,cont=1,cont2=1,cont3=1;
		System.out.println("Introduce la haltura del triangulo:");
		haltura=valor.nextInt();
		while (cont<=haltura) {
			cont2=1;
				while (cont2<cont+1) {
				System.out.print(cont3);
				cont3++;
				cont2++;
			}
			System.out.println(" ");
			cont++;
		}
		valor.close();

	}

}
