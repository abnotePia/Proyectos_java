import java.util.Scanner;
public class proba3 {
//Triangle Floyd modificat
	public static void main(String[] args) {
		int haltura;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la haltura: ");
		haltura=valor.nextInt();
		for (int cont=0;cont<=haltura;cont++) {
			for (int cont2=1;cont2<cont+1;cont2++ ) {
				System.out.print(cont2);
			}
			System.out.println("");
		}
		valor.close();
	}

}
