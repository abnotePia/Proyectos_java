package Arrays_1_dimensio;
import java.util.Scanner;
public class Array86 {

	public static void main(String[] args) {
		/*.Es necessita un aplicatiu on es pugui introduir el codi postal d‟habitants de 20 poblacions
		catalanes. Tindrem 1000 habitants. Es calcularà el valor de forma aleatòria per cada habitant
		enregistrat. Finalment es demana que es digui el nom de la població amb més habitants i el
		número d‟habitants que té, així com la mitja d‟habitants de les 20 poblacions. Les poblacions
		s‟anomenen “Població1”, “Població2”, “Població3”, etc.*/
		int [] codigoPostal={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int [] persones=new int[1000];
		int[] numeroHabitants=new int[20];
		int i=0,cont=0,max=0,posicio=1;
		String text="Població";
		Scanner valor=new Scanner(System.in);
		while (cont<=19) {
		//GENERAR CODI POSTAL PER A CADA PERSONA
		while (i<1000) {
		persones[i]=(int)(Math.random()*(20-1+1))+1;
		i++;
		}
		i=0;
		while (i<1000) {
			//Comprovar quin codi postal te cada habitant per saber a quina poblacio pertany
			if (codigoPostal[cont]==persones[i]) {
				numeroHabitants[cont]++;
			}
			//Comprovar quina es la poblacio amb més habitants
			if (numeroHabitants[cont]>max) {
				max=numeroHabitants[cont];
				posicio=cont+1;
			}
			i++;
		}
		cont++;
	}
		
	System.out.println("La "+text+posicio+" es la que te més habitants amb un total de "+max+" persones");
	System.out.println("La mitjana de totes les poblacions es de "+(1000/20)+" persones per poblacio.");
	valor.close();
}

}
