import java.util.Scanner;
public class condicional26 {

	public static void main(String[] args) {
		int num,x;
		num=(int)(Math.random()*9)+1;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		x= valor.nextInt();
		if (x==num) {
			System.out.println("Enhorabona has encertat!");
		}
		else {
			System.out.println("Has fallat");
		}
	}

}
