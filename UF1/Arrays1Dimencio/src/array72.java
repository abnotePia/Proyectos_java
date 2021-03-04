import java.util.Scanner;
public class array72 {

	public static void main(String[] args) {
		/*.Donada una taula de n elements enters introduïts per l‟usuari, fer un algoritme que ens indiqui
		quants d‟aquests són negatius i quants no. El zero es considera neutre*/
		int[]numero;
		int n,negatius=0,neutres=0,positius=0,cont=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce cuantos numeros quieres introducir: ");
		n=valor.nextInt();
		numero=new int[n];
		while(cont<n) {
			System.out.println("Introduce un numero: ");
			numero[cont]=valor.nextInt();
			if (numero[cont]==0||numero[cont]<0||numero[cont]>0) {
				if (numero[cont]>0) {
					positius++;
				}
				else if (numero[cont]<0) {
					negatius++;
				}
				else if (numero[cont]==0) {
					neutres++;
				}
				cont++;
			}
			else {
				System.out.println("Error!");
			}
		}
		System.out.println("Has introducido "+positius+" numeros positivos. Has introducido "+negatius+" numeros negativos y has introducido "+neutres+" numeros netros");
		valor.close();
	}

}
