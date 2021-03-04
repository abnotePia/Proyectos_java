import java.util.Scanner;
public class bucle46 {

	public static void main(String[] args) {
	int numero,i; //'i' es el contador del bucle while
	Scanner valor=new Scanner(System.in);
	System.out.println("Introduce un numero");
	i=1;
	numero=valor.nextInt();
	System.out.println("Els numeros imparells son: ");
	while (i<=numero) {
		if (i%2!=0) {
			System.out.println(i);
		}
		i=i+1;
		}
	}

}
