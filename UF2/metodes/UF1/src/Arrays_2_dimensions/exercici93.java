package Arrays_2_dimensions;
import java.util.Scanner;
public class exercici93 {

	public static void main(String[] args) {
		double [] [] taula=new double[5][5];
		Scanner valor=new Scanner(System.in);
		int  fila;
		int col;
		int [] num=new int[5];
		int oportunitats=0;
		while (oportunitats<10) {
			System.out.println("En que fila quieres introducir el numero");
			fila=valor.nextInt();
			System.out.println("En que columna quieres introducir el numero");
			col=valor.nextInt();
			if (fila<5 && col<5) {
				if (taula[fila][col]==0 ) {
			taula[fila][col]=(int)(Math.random()*(100-1+1))+1;
			oportunitats++;
				}
				else {
					System.out.println("Ya se ha introducido un numero en esta casilla");
				}
			}
			else {
				System.out.println("Fora dels limits\nTorna ha intentar-ho");
			}
			}
		for (int filas=0;filas<5;filas++) {
			for (int colu=0;colu<5;colu++) {
				if (taula[filas][colu]!=0) {
					num[filas]++;
				}
			}
			System.out.println("La fila "+filas+" te un total de "+num[filas]+" numeros introduits");
		}
		
		valor.close();
		}

	}


