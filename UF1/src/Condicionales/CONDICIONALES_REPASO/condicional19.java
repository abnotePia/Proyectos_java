package Condicionales.CONDICIONALES_REPASO;
import java.io.IOException;

public class condicional19 {

	public static void main(String[] args) throws IOException {
		int text=0,a=0;
		while (text!=13 ) {
			text=System.in.read();
			if (text!=97 || text!=65 && text!=13 && text!=32) {
				a++;
			}
		}
		System.out.println("El numero de lletres que hi han diferent de a es: "+a);

	}

}
