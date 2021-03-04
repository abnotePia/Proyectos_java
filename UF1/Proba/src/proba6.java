import java.util.Scanner;
public class proba6 {

	public static void main(String[] args) {
		// Piramide invertida
		int haltura;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la haltura del triangulo invertido: ");
		haltura=valor.nextInt();
		for (int cont=0;cont<haltura;cont++) {
			for (int espaiBlanc=0;espaiBlanc<haltura-(haltura-cont);espaiBlanc++) {
				System.out.print(" ");
			}
			for(int asterisc=1;asterisc<(haltura-cont)*2;asterisc++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		valor.close();
	}

}
