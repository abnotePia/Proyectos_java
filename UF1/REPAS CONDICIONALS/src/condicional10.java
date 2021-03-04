import java.util.Scanner;
public class condicional10 {

	public static void main(String[] args) {
		int taula,cont=1;
		Scanner valor=new Scanner(System.in);
		System.out.println("Que tabla quieres: ");
		taula=valor.nextInt();
			while (cont<=10) {
			System.out.println(taula+"*"+cont+"="+(taula*cont));
			cont++;
			}
			valor.close();
	}

}
