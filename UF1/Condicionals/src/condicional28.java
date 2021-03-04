import java.util.Scanner;
public class condicional28 {

	public static void main(String[] args) {
		int num,x,oportunitat;
		num=(int)(Math.random()*9)+1;
		oportunitat=3;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		x= valor.nextInt();
		if (x==num && oportunitat>0) {
			System.out.println("Enhorabona has encertat!");
		}
		else {
			System.out.println("Has fallat "+oportunitat+ " oportunitats");
			oportunitat= oportunitat-1;
			if (x<num) {
				System.out.println("El numero "+x+" es més petit que el numero");
			}
			else if (num<x) {
				System.out.println("El numero "+x+" es més gran que el numero");
			}
			System.out.println("Introduce un numero: ");
			x= valor.nextInt();
			if (x==num && oportunitat>0) {
				System.out.println("Enhorabona has encertat!");
				}
			else {
				System.out.println("Has fallat et quedan "+oportunitat+ " oportunitats");
				oportunitat= oportunitat-1;
				if (x<num) {
					System.out.println("El numero "+x+" es més petit que el numero");
				}
				else if (num<x) {
					System.out.println("El numero "+x+" es més gran que el numero");
				}
				System.out.println("Introduce un numero: ");
				x= valor.nextInt();
				if (x==num && oportunitat>0) {
					System.out.println("Enhorabona has encertat!");
					}
				else {
					System.out.println("Has fallat"+ " no tens més oportunitats");
					oportunitat= oportunitat-1;
					if (x<num) {
						System.out.println("El numero "+x+" es més petit que el numero");
					}
					else if (num<x) {
						System.out.println("El numero "+x+" es més gran que el numero");
					}
				}
			}
		}
	}
}
