package Arrays_2_dimensions;
public class exercici90 {

	public static void main(String[] args) {
		double [][] taula=new double[10][10];
		double [] max=new double [10];
		double [] min=new double [10];
		int cont=0;
		for (int filas=0;filas<10;filas++) {
			for (int col=0;col<10;col++) {
				taula[filas][col]=cont;
				cont++;
				if (taula[filas][col]>max[filas]) {
					max[filas]=taula[filas][col];
				}
				if (col==0) {
					min[filas]=taula[filas][col];
				}
				else if(taula[filas][col]<min[filas]) {
					min[filas]=taula[filas][col];
				}
			}
			System.out.println("De la fila "+filas+"\nEl numero més gran es "+max[filas]+"\nEl numero més petit es "+min[filas]);
		}
	}

}
