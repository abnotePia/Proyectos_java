import java.util.Scanner;
public class bucle54 {
	public static void main(String[] args) {
		int dia,mes, any;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un dia: ");
		dia=valor.nextInt();
		System.out.println("Introduce un mes: ");
		mes=valor.nextInt();
		System.out.println("Introduce un any: ");
		any=valor.nextInt();
		if (dia<=30 && mes<=12 && mes!=2) {
			System.out.println("La data "+dia+"/"+mes+"/"+any+" es correcte");
		}
		else if (dia<=28 && mes==2) {
			System.out.println("La data "+dia+"/"+mes+"/"+any+" es correcte");
		}
		else if (dia<=29 && mes==2 && any%4==0) {
			System.out.println("La data "+dia+"/"+mes+"/"+any+" es correcte");
		}
		else {
			System.out.println("La data "+dia+"/"+mes+"/"+any+" es incorrecte");
		}
	}

}
