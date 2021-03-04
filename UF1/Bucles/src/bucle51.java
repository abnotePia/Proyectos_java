import java.util.Scanner;
public class bucle51 {

	public static void main(String[] args) {
		int haltura;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la haltura del triangulo:  ");
		haltura=valor.nextInt();
		for (int cont=1;cont<=haltura;cont++) {
			for (int espaiBlanc=0;espaiBlanc<haltura-cont;espaiBlanc++) {
				System.out.print(" ");
			}
			for (int asteric=1;asteric<(cont*2);asteric++) {
				System.out.print("*");
			}	
			System.out.println("");
		}
	}
}
