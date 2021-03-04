package Inicio;
import java.util.Scanner;
public class import_i_descompte {

	public static void main(String[] args) {
		double importe,importDescompte,descompte;
		String Importe,Importfinal;
		Importe= "Introdueix l'import: ";
		Importfinal="L'import total comptant el descompte es de: ";
		Scanner entrada= new Scanner(System.in);
		System.out.println(Importe);
		importe= entrada.nextInt();
		descompte= importe*0.2;
		importDescompte= importe-descompte;
		System.out.println(Importfinal+importDescompte);
	}

}
