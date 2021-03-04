import java.util.Scanner;
public class bucle45 {
	public static void main(String[] args) {
		int numero1,numero2,i;
		i=1;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introdueix la taula que vols: ");
		numero2= valor.nextInt();
		System.out.println("Introdueix fins que numero vols que es multipliqui ");
		numero1= valor.nextInt();
		while (i<=numero1) {
			System.out.println(numero2+" * "+i+" = "+ (i*numero2));
			i=i+1;
		}
	}
}
