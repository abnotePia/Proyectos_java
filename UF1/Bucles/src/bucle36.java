import java.util.Scanner;
public class bucle36 {

	public static void main(String[] args) {
	int repeticio, numero,i;
	Scanner valor= new Scanner(System.in);
	numero=1;
	i=1;
	System.out.println("Itroduce cuantas veces quieres que se repita la seqüencia: ");
	repeticio=valor.nextInt();
	while (i<=repeticio) {
		numero=numero*2;
		i=i+1;
		System.out.println(numero);
		}
	}

}
