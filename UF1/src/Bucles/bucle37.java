package Bucles;
import java.util.Scanner;
public class bucle37 {

	public static void main(String[] args) {
		int contador=0;
		int bitlletSortida=0;
		int importe;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un importe: ");
		importe= valor.nextInt();
		while (contador<9) {
			int importDiv=0;
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
			
			}
			bitlletSortida=importe/importDiv;
			importe=importe%importDiv;
			System.out.println("Els bitllets "+text+" son "+bitlletSortida);
			contador++;
		}
		valor.close();
	}
}
