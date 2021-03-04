import java.util.Scanner;
public class numero14 {

	public static void main(String[] args) {
	int importe,bitllet100,bitllet50,bitllet20,bitllet10,bitllet5;
	String Importe,billete100,billete50,billete20,billete10,billete5,ll;
	Importe="Introduce una cantidad de dinero: ";
	ll="La cantidad introducida tendra ";
	billete100=" billetes de 100"; billete50=" billetes de 50"; billete20=" billetes de 20";
	billete10=" billetes de 10"; billete5=" billetes de 5";
	Scanner valor= new Scanner(System.in);
	System.out.println(Importe);
	importe= valor.nextInt();
	bitllet100=importe/100;
	importe=importe%100; //El operador % te devuelve el resto de la división entre el dividendo 
	bitllet50=importe/50;
	importe=importe%50;
	bitllet20=importe/20;
	importe=importe%20;
	bitllet10=importe/10;
	importe=importe%10;
	bitllet5=importe/5;
	System.out.println(ll+bitllet100+billete100);System.out.println(ll+bitllet50+billete50);
	System.out.println(ll+bitllet20+billete20); System.out.println(ll+bitllet10+billete10);
	System.out.println(ll+bitllet5+billete5);
	}
}
