import java.util.Scanner;
public class Array84 {

	public static void main(String[] args) {
		/*.Introduir N valors reals en una taula. Posteriorment s'hauran de generar 2 taules. En una posarem
		el valors positius i en l'altre els negatius. Posteriorment haurem de mostrar cada una de les
		taules en ordre invers.*/
		int [] taula1;
		int[] taulaPositiva;
		int[] taulaNegativa;
		int llarg,cont=0,positius=0,negatius=0,cont2=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la longuitud de la array: ");
		llarg=valor.nextInt();
		taula1=new int[llarg];
		while (cont<llarg) {
			System.out.println("Introduce un numero: ");
			taula1[cont]=valor.nextInt();
			if (taula1[cont]>0) {
				positius++;
			}
			else {
				negatius++;
			}
			cont++;
		}
		taulaPositiva=new int[positius];
		taulaNegativa=new int[negatius];
		cont=0;
		while (cont<llarg) {
			if (taula1[cont]>0) {
				taulaPositiva[cont]=taula1[cont];
			}
			else {
				taulaNegativa[cont2]=taula1[cont2];
				cont2++;
			}
			cont++;
		}
		System.out.println("La taula positiva es: ");
		for (int i=(taulaPositiva.length-1),j=0;j<positius;j++,i--) {
			taula1[j]=taulaPositiva[i];
			System.out.println(taula1[j]);
		}
		System.out.println("La taula negativa es: ");
		for (int i=(taulaNegativa.length-1),j=0;j<positius;j++,i--) {
			taula1[j]=taulaNegativa[i];
			System.out.println(taula1[j]);
		}
		valor.close();
	}

}
