import java.io.IOException;

public class condicional18 {

	public static void main(String[] args) throws IOException {
		int text=0,a=0;
		while (text!=13 ) {
			text=System.in.read();
			if (text==97 | text==65) {
				a++;
			}
		}
		System.out.println("El numero de a que hi han es: "+a);
	}

}
