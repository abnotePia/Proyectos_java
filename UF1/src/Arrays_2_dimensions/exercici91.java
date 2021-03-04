package Arrays_2_dimensions;

public class exercici91 {

	public static void main(String[] args) {
		// canviar les files per les columnes i les columnes per files
		double [][] matriu1=new double[10][10];
		double [][] matriu2=new double[10][10];
		int cont=0;
		//Per omplenar las matrius
		for (int filas=0;filas<10;filas++) {
			for (int col=0;col<10;col++) {
				matriu1 [filas][col]=cont;
				matriu2[col][filas]=matriu1 [filas][col];
				cont++;
				System.out.print(matriu1 [filas][col]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("\nMatriu transposada");
		for (int col=0;col<10;col++) {
			for (int filas=0;filas<10;filas++) {
				System.out.print(matriu2 [col][filas]+" ");
			}
			System.out.println(" ");
		}
		
		
		
	}

}
