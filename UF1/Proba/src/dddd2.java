import java.util.Scanner;
public class dddd2 {

	public static void main(String[] args) {
		int a=0,b=0,decimals,unitats,centesimes;
		boolean correcte=false,imprimir=true;
		Scanner valor=new Scanner(System.in);
		while (correcte==false) {
			System.out.println("Introduce el valor de a:");
			a=valor.nextInt();
			System.out.println("Introduce el valor de b:");
			b=valor.nextInt();
			if (a<b && a>=10) {
			correcte=true;
			}
			else {
				System.out.println("Numeros introduits no compleixen les caracteristiques");
			}
		}
		for (int cont=a;cont<=b;cont++) {
			unitats=cont%10;
			decimals=(cont%100)/10;
			centesimes=(cont%1000)/100;
			if (unitats==decimals && unitats==centesimes &&imprimir==true) {
			System.out.println(cont);
			imprimir=false;
			}
		}
		valor.close();
	}

}
