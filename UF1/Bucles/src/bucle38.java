import java.util.Scanner;
public class bucle38 {

	public static void main(String[] args) {
	int repeticio, i, numero;
	Scanner valor=new Scanner (System.in);
	i=1;
	numero=1;
	System.out.println("Indica les vegades que vols que es repeteixi la serie: ");
	repeticio=valor.nextInt();
	System.out.println("La sequencia es: ");
	while (i<=repeticio) {
		numero=i;
		numero=numero*numero;
		System.out.println(numero);
		i=i+1;
	}
	}

}
