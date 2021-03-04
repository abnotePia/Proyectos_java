import java.util.Scanner;
public class condicional8 {

	public static void main(String[] args) {
		int numero,Gran;
		Scanner valor=new Scanner(System.in);
		numero=valor.nextInt();
		Gran=numero;
		while (numero!=0) {
			System.out.println("Introduce un numero: ");
			numero=valor.nextInt();
			if (numero>Gran) {
				Gran=numero;
			}
		}
		System.out.println("El numero més gran introduit es: "+Gran);
		valor.close();
	}

}
