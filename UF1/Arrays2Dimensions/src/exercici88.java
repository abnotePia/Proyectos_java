import java.util.Scanner;
public class exercici88 {

	public static void main(String[] args) {
		double [][] taula=new double[10][10];
		double cont=0;
		double suma=0;
		//inicialitzar els valor de l'array. Recorro les files
		for (int fila=0;fila<taula.length;fila++) {
			//Per cada fila recorro les columnes
			for (int col=0;col<taula[fila].length;col++) {
				taula[fila][col]=cont;
				cont++;
				System.out.print(taula[fila][col]+" ");
			}
			System.out.println(" ");
		}
		// Recorrem les caselles per tal de fer la suma global.(Es podria fer amb només un doble for)
		for (int fila=0;fila<taula.length;fila++) {
			//Per cada fila recorro les columnes
			for (int col=0;col<taula[fila].length;col++) {
				suma=suma+taula[fila][col];
			}
		
		}
		System.out.println("\nLa suma total es: "+suma);
	}

}
