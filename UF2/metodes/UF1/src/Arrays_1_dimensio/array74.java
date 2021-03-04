package Arrays_1_dimensio;
import java.util.Scanner;
public class array74 {

	public static void main(String[] args) {
		//Realitzar un algoritme que ens permeti entrar n nombres enters en una taula i a continuació que
		//inverteixi la taula (el primer element passa a l‟últim introduït, el segon al penúltim,...). Una
		//vegada invertida la taula mostrar-la per pantalla.*/
		int[] numero;
		int numero2[];
		int n,cont=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros que quieres introducir: ");
		n=valor.nextInt();
		numero=new int[n];
		numero2=new int[numero.length];
		while (cont<n) {
			System.out.println("Introduce un numero: ");
			numero[cont]=valor.nextInt();
			cont++;
		}
		numero2=new int[numero.length];
        for(int i=(numero.length-1),j=0;i>=0;i--,j++){
           numero2[j]=numero[i];
           System.out.println(numero2[j]);
        }
        valor.close();
	}

}
