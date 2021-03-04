import java.util.Scanner;

public class exercici94 {

	public static void main(String[] args) {
		double [][] matriu1=new double[10][10];
		int cont=0;
		boolean continuar=true;
		Scanner valor=new Scanner(System.in);
		//Rellenar matriz
		for (int filas=0;filas<10;filas++) {
			for (int col=0;col<10;col++) {
				matriu1[filas][col]=cont;
				cont++;
			}
		}
		int fila=1,col=1;
		System.out.println("Eliminar numeros:");
		while (continuar==true) {
			System.out.println("Introduce la fila:");
			fila=valor.nextInt();
			System.out.println("Introduce la columna:");
			col=valor.nextInt();
			if (fila==0 && col==0) {
				continuar=false;
			}
		if ((col<10 && fila<10) &&(col>=0)&&(fila>=0)) {
			matriu1[fila][col]=0;
				for (int columnes=col+1;columnes<10;columnes++) {
				matriu1[fila][columnes-1]=matriu1[fila][columnes];
					if (columnes==9) {
						matriu1[fila][columnes]=0;
					}
			}
		}
		else {
			System.out.println("Imposible eliminar casella es troba fora dels limits de la matriu");
		}
			
	}
		valor.close();
		//Imprimir matriu final
		for (int filas=0;filas<10;filas++) {
			for (int columnes=0;columnes<10;columnes++) {
				System.out.print(" "+matriu1[filas][columnes]);
			}
			System.out.println(" ");
		}
	}

}
