import java.util.Scanner;

public class exercici_2 {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		double [] Temperatura=new double[15];
		double maxrepetides=0,tempemaxrepe=0;
		int [] numVegades=new int[15];
		
		int cont=0;
		do {
			System.out.println("Introduce una temperatura: ");
			Temperatura[cont]=valor.nextDouble();
			for (int cont2=0;cont2<=cont;cont2++) {
				if (Temperatura[cont2]==Temperatura[cont] && cont2!=cont) {
					numVegades[cont]++;
					if (cont2==cont+1) {
					System.out.println("Aquesta temperatura ja ha sigut introduida previament ");
					}
				}
				
			}
			if (cont==0) {
				maxrepetides=numVegades[cont];
				tempemaxrepe=Temperatura[cont];
				
			}
			else if (numVegades[cont]>maxrepetides) {
				maxrepetides=numVegades[cont];
				tempemaxrepe=Temperatura[cont];
			}
			
			
			cont++;
		} while (Temperatura[cont-1]!=0);
		System.out.println("La temperatura que se ha repetido mas veces es "+tempemaxrepe+" y se a repetido "+maxrepetides);
		valor.close();
	}

}
