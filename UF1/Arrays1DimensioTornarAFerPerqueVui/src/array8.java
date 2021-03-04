import java.io.IOException;

public class array8 {

	public static void main(String[] args) throws IOException {
		char [] text;
		int lletra;
		int cont=0;
		text=new char[250];
		while (text[cont]!='.') {
			lletra=System.in.read();
			text[cont]=(char)lletra;
			cont++;
		}
	}

}
