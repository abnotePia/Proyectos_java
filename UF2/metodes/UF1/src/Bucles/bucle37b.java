package Bucles;
import java.util.Scanner;
public class bucle37b {

	public static void main(String[] args) {
		int contador=0;
		double bitlletSortida=0;
		double importe;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un importe: ");
		importe= valor.nextDouble();
		while (contador<14) {
			double importDiv=0;
			String text="";
			switch(contador) {
				case 0:
					importDiv=500;
					text="500";
					break;
				case 1:
					importDiv=200;
					text="200";
					break;
				case 2:
					importDiv=100;
					text="100";
					break;
				case 3:
					importDiv=50;
					text="50";
					break;
				case 4:
					importDiv=20;
					text="20";
					break;	
				case 5:
					importDiv=10;
					text="10";
					break;	
				case 6:
					importDiv=5;
					text="5";
					break;
				case 7:
					importDiv=2;
					text="2";
					break;
				case 8:
					importDiv=1;
					text="1";
					break;
				case 9:
					importDiv=0.5;
					text="0,50";
					break;
				case 10:
					importDiv=0.2;
					text="0,20";
					break;
				case 11:
					importDiv=0.1;
					text="0,10";
					break;
				case 12:
					importDiv=0.05;
					text="0,05";
					break;
				case 13:
					importDiv=0.01;
					text="0,01";
			}
			bitlletSortida=importe/importDiv;
			bitlletSortida=(int)bitlletSortida;
			importe=importe%importDiv;
			System.out.println("Els bitllets "+text+" son "+bitlletSortida);
			
			
			contador++;
		}
	}

}
