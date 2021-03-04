import java.util.Scanner;

public class proba2alreves {
//Especie de triangle floyd del reves i amb esteriscs
	public static void main(String[] args) {
		int haltura,haltura2;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la haltura: ");
		haltura=valor.nextInt();
		haltura2=haltura+1;
		for (int cont=0;cont<haltura;cont++) {
				for (int cont2=0;cont2<haltura-cont;cont2++) {
					System.out.print("*");
					
				}
			System.out.println("");
		} 
		valor.close();

	}

}
