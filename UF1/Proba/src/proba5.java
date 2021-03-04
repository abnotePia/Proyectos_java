import java.util.Scanner;
public class proba5 {
//Piramide
	public static void main(String[] args) {
		int haltura, cont=1,espaiBlanc=1,asterisc=1;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la haltura: ");
		haltura=valor.nextInt();
		while (cont<=haltura) {
			while (espaiBlanc<=haltura-cont) {
				System.out.print(" ");
				espaiBlanc++;
			}
			
			while(asterisc<cont*2) {
				System.out.print("*");
				asterisc++;
			}
			System.out.println("");
			cont++;
			asterisc=1;
			espaiBlanc=1;
		}
		valor.close();
		
			

	}

}
