import java.util.Scanner;
public class condicional24 {

	public static void main(String[] args) {
		double x;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce tu nota numerica: ");
		x=valor.nextDouble();
		if (x>=9 && x<=10) {
			System.out.println("Tu nota es Excelente");
		}
		else if (x>=6.5) {
			System.out.println("Tu nota es Notable");
		}
		else if (x>=5) {
			System.out.println("Tu nota es Suficiente");
		}
		else {
			System.out.println("Tu nota es Suspenso");
		}
	}
}
