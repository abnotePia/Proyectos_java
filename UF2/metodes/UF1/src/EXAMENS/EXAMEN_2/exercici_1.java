package EXAMENS.EXAMEN_2;
import java.util.Scanner;
public class exercici_1 {
public static int MIN=100;
	public static void main(String[] args) {
		double quantitat,continuar=1,posibleDescompte,descompte=0,quantitatAmbDescompte=0;
		String text=" ",DES="";
		Scanner valor=new Scanner(System.in);
		do {
			System.out.println("Introdueix quants diners portes");
			quantitat=valor.nextInt();
			if (quantitat<100 && quantitat>=0) {
				System.out.println("No s'aplicara cap promocio");
			}
			else if (quantitat<0) {
				System.out.println("Quantitat introduida no pot ser negativa");
			}
			else if (quantitat>=MIN) {
				System.out.println("Taula de descomptes");
				System.out.println("COLOR				DESCUENTO");
				System.out.println("BOLA BLANCA			NO TIENE DESCUENTO");
				System.out.println("BOLA ROJA			10 POR CIENTO");
				System.out.println("BOLA AZUL  			20 POR CIENTO");
				System.out.println("BOLA VERDE			25 POR CIENTO");
				System.out.println("BOLA AMARILLLA			50 POR CIENTO");
		
				posibleDescompte=(int)(Math.random()*(5-1+1))+1;
				if (posibleDescompte==1) {
					descompte=0;
					text="BLANCA";
					DES="0";
				}
				else if (posibleDescompte==2) {
					descompte=0.1;
					text="ROJA";
					DES="10";
				}
				else if (posibleDescompte==3) {
					descompte=0.2;
					text="AZUL";
					DES="20";
				}
				else if (posibleDescompte==4) {
					descompte=0.25;
					text="VERDE";
					DES="25";
				}
				else if (posibleDescompte==5) {
					descompte=0.5;
					text="AMARILLA";
					DES="50";
				}
				System.out.println("\nALEATORIAMENTE USTED OBTUVO LA BOLA "+text);
				System.out.println("\nFELICIDADES, HAS GANADO UN  "+DES+" PORCIENTO DE DESCUENTO");
				quantitatAmbDescompte=quantitat-(quantitat*descompte);
				System.out.println("Su nuevo total a pagar es: "+quantitatAmbDescompte);
			}
			System.out.println("Si desea salir pulse 1 en caso contrario presione cualquier boton");
			continuar=valor.nextInt();
		}while(continuar!=1);
		valor.close();
	}

}
