package EXAMENS.EXAMEN_1;
import java.util.Scanner;
public class exercici_3 {

	public static void main(String[] args) {
		int cartes,carta1=0,carta2=0,carta3=0,carta4=0,carta5=0,carta6=0,carta7=0,carta10=0,carta11=0,carta12=0;
		int llarg=0;
		double punts=0;
		double suma=0;
		boolean donar=true;
		Scanner valor=new Scanner(System.in);
		do {
			System.out.println("Vols una carta?");
			System.out.println("[T] SI");
			System.out.println("[F] NO");
			donar=valor.nextBoolean();
			if (donar==true) {			
				cartes=(int)(Math.random()*(12-1+1))+1;
				if (cartes==1) {
					carta1++;
					if (carta1==4) {
						cartes=8;
					}
				}
				if (cartes==2) {
					carta2++;
					if (carta2==4) {
						cartes=8;
					}
				}
				if (cartes==3) {
					carta3++;
					if (carta3==4) {
						cartes=8;
					}
				}
				if (cartes==4) {
					carta4++;
					if (carta4==4) {
						cartes=8;
					}
				}
				if (cartes==5) {
					carta5++;
					if (carta5==4) {
						cartes=8;
					}
				}
				if (cartes==6) {
					carta6++;
					if (carta6>4) {
						cartes=8;
					}
				}
				if (cartes==7) {
					carta7++;
					if (carta7==4) {
						cartes=8;
					}
				}
				if (cartes==10) {
					carta10++;
					if (carta10==4) {
						cartes=8;
					}
				}
				if (cartes==11) {
					carta11++;
					if (carta11==4) {
						cartes=8;
					}
				}
				if (cartes==12) {
					carta12++;
					if (carta12==4) {
						cartes=8;
					}
				}
				if (cartes!=8 && cartes!=9 ) {
					if (cartes<=12 && cartes>=10) {
						punts=0.5;
					}
					else {
						llarg=0;
						while (cartes!=llarg) {
							punts++;
							llarg++;
						}
					}
					suma=suma+punts;
					System.out.println("Portes "+suma+" punts");
				}
			}
			if (donar==false) {
				if (suma<7.5) {
					System.out.println("Ens hem quedat a "+(7.5-suma)+" del 7,5");
				}
				else {
					System.out.println("Ens hem pasat "+(suma-7.5)+" del 7,5");
				} 
			}
		}while(donar!=false);
		

	}

}
