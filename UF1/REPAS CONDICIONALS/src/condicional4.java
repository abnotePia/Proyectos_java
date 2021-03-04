import java.util.Scanner;

public class condicional4 {

	public static void main(String[] args) {
		double bitllet,importDiv=0,bitlletSortida=0;;
		int contador=1;
		String text="";
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la cantidad entera en euros:");
		bitllet=valor.nextDouble();
		while (contador<=14) {
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
			case 10:
				importDiv=0.5;
				text="0,50";
				break;
			case 11:
				importDiv=0.2;
				text="0,20";
				break;
			case 12:
				importDiv=0.1;
				text="0,10";
				break;
			case 13:
				importDiv=0.05;
				text="0,05";
				break;
			case 14:
				importDiv=0.01;
				text="0,01";
				break;
			}
			bitlletSortida=bitllet/importDiv;
			System.out.println("Hi han "+(int)bitlletSortida+" bitllets de "+text);
			bitllet=bitllet%importDiv;
			contador++;
		}

valor.close();
	}

}
