package EXAMENS.EXAMEN_1;
import java.util.Scanner;
public class EXERCICIS_4 {

	public static void main(String[] args) {
		int NumeroAleatori,repetit1=0,repetit2=0,repetit3=0,repetit4=0,repetit5=0,repetit6=0,repetit7=0,repetit10=0,repetit11=0,repetit12=0;
		double punts,puntsTotals=0;
		Scanner valor=new Scanner(System.in);
		boolean continuar=true;
		while (continuar==true) {	
			NumeroAleatori=(int) (Math.random()*(12-1+1))-1;
			if (NumeroAleatori==1) {
				repetit1=repetit1+1;
				if (repetit1==4) {
					NumeroAleatori=8;
				}
			}
			if (NumeroAleatori==2) {
				repetit2=repetit2+1;
				if (repetit2==4) {
					NumeroAleatori=8;
				}
			}
			if (NumeroAleatori==3) {
				repetit3=repetit3+1;
				if (repetit3==4) {
					NumeroAleatori=8;
				}
			}
			if (NumeroAleatori==4) {
				repetit4=repetit4+1;
				if (repetit4==4) {
					NumeroAleatori=8;
				}
			}
			if (NumeroAleatori==5) {
				repetit5=repetit5+1;
				if (repetit5==4) {
					NumeroAleatori=8;
				}
			}
			if (NumeroAleatori==6) {
				repetit6=repetit6+1;
				if (repetit6==4) {
					NumeroAleatori=8;
				}
			}
			if (NumeroAleatori==7) {
				repetit7=repetit7+1;
				if (repetit7==4) {
					NumeroAleatori=8;
				}
			}
			if (NumeroAleatori==10) {
				repetit10=repetit10+1;
				if (repetit10==4) {
					NumeroAleatori=8;
				}
			}
			if (NumeroAleatori==11) {
				repetit11=repetit11+1;
				if (repetit11==4) {
					NumeroAleatori=8;
				}
			}
			if (NumeroAleatori==12) {
				repetit12=repetit12+1;
				if (repetit12==4) {
					NumeroAleatori=8;
				}
			}
			if (NumeroAleatori!=8 || NumeroAleatori!=9 ) {
				System.out.println("Portes "+puntsTotals+" punts");
				if (NumeroAleatori==10 || NumeroAleatori==11||NumeroAleatori==12) {
					punts=0.5;
				}
				else {
					punts=NumeroAleatori;
				}
				System.out.println("Vols continuar jugant?");
				continuar=valor.nextBoolean();
				if (continuar==true) {
					puntsTotals=puntsTotals+punts;
				}
				else {
					if (puntsTotals>7.5) {
					System.out.println("Els teus punts es sobrepasan "+(puntsTotals-7.5)+" del 7,5");
					}
					else {
					System.out.println("Els teus punts li faltan "+(7.5-puntsTotals)+" del 7,5");
					}
				}
			}
		}
		valor.close();
	}
}
