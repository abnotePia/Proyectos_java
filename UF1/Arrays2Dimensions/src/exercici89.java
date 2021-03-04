
public class exercici89 {

	public static void main(String[] args) {
		double [][] taula=new double[10][10];
		double [] suma=new double [10];
		double [] suma2=new double [10];
		int cont=0;
		System.out.println("Suma files");
		for (int filas=0;filas<10;filas++) {
			for (int col=0;col<10;col++) {
				taula[filas][col]=cont;
				cont++;
				suma[filas]=suma[filas]+taula[filas][col];
				
			}
			System.out.println(suma[filas]);
		}
		System.out.println("Suma columnes");
		for (int filas=0;filas<10;filas++) {
			for (int col=0;col<10;col++) {
				suma2[filas]=suma2[filas]+taula[col][filas];
				
			}
			System.out.println(suma2[filas]);
		}
	}

}
