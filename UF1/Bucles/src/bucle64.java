import java.util.Scanner;
public class bucle64 {
	public static void main(String[] args) {
		int num,negatius;
		num=0;
		negatius=0;
		do {
			Scanner valor=new Scanner(System.in);
			System.out.println("Introduce un numero: ");
			num=valor.nextInt();
			if (num<0) {
				negatius++;
			}
		} while (num!=0);
		System.out.println("En aquesta seqüencia hi han "+negatius+" numeros negatius");

	}

}
