import java.util.Scanner;
public class exercici_1 {

	public static void main(String[] args) {
		int numero1,numero2,numero3,mitjana,max,min;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un numero no negativo: ");
		numero1=valor.nextInt();
		System.out.println("Introduce un numero no negativo: ");
		numero2=valor.nextInt();
		System.out.println("Introduce un numero no negativo: ");
		numero3=valor.nextInt();
		if (numero1<0) {
			System.out.println("Els numeros introduits no poden ser negatius");
			if (numero2<numero3) {
				System.out.println("El valor mes gran es "+numero3+" i el valor més petit es "+numero2);
				
			}
			else if (numero2>numero3) {
				System.out.println("El valor mes gran es "+numero2+" i el valor més petit es "+numero3);
			}
			mitjana=(numero2+numero3)/2;
		}
		else if (numero2<0) {
			System.out.println("Els numeros introduits no poden ser negatius");
			if (numero1<numero3) {
				System.out.println("El valor mes gran es "+numero3+" i el valor més petit es "+numero1);
				
			}
			else if (numero1>numero3) {
				System.out.println("El valor mes gran es "+numero1+" i el valor més petit es "+numero3);
			}
			mitjana=(numero1+numero3)/2;
		}
		else if (numero3<0) {
			System.out.println("Els numeros introduits no poden ser negatius");
			if (numero2<numero1) {
				System.out.println("El valor mes gran es "+numero2+" i el valor més petit es "+numero1);
				
			}
			else if (numero2>numero1) {
				System.out.println("El valor mes gran es "+numero2+" i el valor més petit es "+numero1);
			}
			mitjana=(numero2+numero1)/2;
		}
		else{
			if (numero1>numero2 && numero1>numero3) {
				System.out.println("El numero més gran es "+numero1);
				if (numero2>numero3) {
					System.out.println("El numero més petit es "+numero3);
				}
				else {
					System.out.println("El numero més gran es "+numero2);
				}
			}
			else if (numero2>numero1 && numero2>numero3) {
				System.out.println("El numero més gran es "+numero2);
				if (numero1>numero3) {
					System.out.println("El numero més petit es "+numero3);
				}
				else {
					System.out.println("El numero més gran es "+numero1);
				}
			}
			else if (numero3>numero1 && numero3>numero2) {
				System.out.println("El numero més gran es "+numero3);
				if (numero1>numero2) {
					System.out.println("El numero més petit es "+numero2);
				}
				else {
					System.out.println("El numero més gran es "+numero1);
				}
			}
			mitjana=(numero1+numero2+numero3)/3;
		}
		System.out.println("La mitjana es "+mitjana);
		valor.close();
	}

}
