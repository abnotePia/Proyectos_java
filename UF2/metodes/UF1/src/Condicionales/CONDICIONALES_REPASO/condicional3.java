package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;
public class condicional3 {

	public static void main(String[] args) {
		int bitllet,contador=1,importDiv=0,bitlletSortida=0;
		String text="";
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la cantidad entera en euros:");
		bitllet=valor.nextInt();
		while (contador<=9) {
			switch(contador) {
			case 1:
				importDiv=500;
				text="500";
				break;
			case 2:
				importDiv=200;
				text="200";
				break;
			case 3:
				importDiv=100;
				text="100";
				break;
			case 4:
				importDiv=50;
				text="50";
				break;
			case 5:
				importDiv=20;
				text="20";
				break;
			case 6:
				importDiv=10;
				text="10";
				break;
			case 7:
				importDiv=5;
				text="5";
				break;
			case 8:
				importDiv=2;
				text="2";
				break;
			case 9:
				importDiv=1;
				text="1";
				break;
			}
			bitlletSortida=bitllet/importDiv;
			System.out.println("Hi han "+bitlletSortida+" bitllets de "+text);
			bitllet=bitllet%importDiv;
			contador++;
		}

	}

}
