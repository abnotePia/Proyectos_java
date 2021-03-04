import java.util.Scanner;
public class DescomposicioBitllets {

	public static void main(String[] args) {
		int importe,bitllet5,bitllet10,bitllet20,bitllet50,bitllet100;
		String Importe, Bitllet5,Bitllet10,Bitllet20,Bitllet50,Bitllet100;
		Importe="Introduce la cantidad de euros: ";
		Bitllet5="Numero de billetes de 5: "; Bitllet10="Numero de billetes de 10: "; Bitllet20="Numero de billetes de 20: ";
		Bitllet50="Numero de billetes de 50: "; Bitllet100="Numero de billetes de 100: ";
		Scanner valor=new Scanner(System.in);
		System.out.println(Importe);
		importe=valor.nextInt();
		
		bitllet5= importe/5; bitllet10= importe/10; bitllet20= importe/20;bitllet50= importe/50;
		bitllet100= importe/100;
		System.out.println(Bitllet5+bitllet5); System.out.println(Bitllet10+bitllet10); System.out.println(Bitllet20+bitllet20);
		System.out.println(Bitllet50+bitllet50); System.out.println(Bitllet100+bitllet100);
	}
}
