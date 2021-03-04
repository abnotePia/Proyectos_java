import java.util.Scanner;
public class Array85 {
	static final int MAX=35;
	static final int MIN=-10;
	public static void main(String[] args) {
		/*Una estació climàtica proporciona un parell de temperatures diàries (màxima i mínima). El Rang
		permès de les temperatures és entre -10 i 35. La parella final és 0,0. L‟usuari indicarà el nombre
		de dies pels quals vol desar les temperatures. De les temperatures preses calcular la mitja
		màxima, la mitja mínima, el nombre d‟errors (aquells dies que la temperatura màxima o mínima
		no esta dins el rang desitjat) i el percentatge d‟errors respecte al total de temperatures que es
		tenen. Es simularà l‟entrada de les temperatures per teclat.*/
		int[] tempMax;
		int[] tempMin;
		int dies,nombreErrors=0,cont=0;
		double mitjanaMaxima=0,mitjanaMinima=0,percentatge;
		boolean continuar=true;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el numero de dias que quieres saber la temperatura: ");
		dies=valor.nextInt();
		tempMax=new int[dies];
		tempMin=new int[dies];
		while (cont<dies && continuar==true) {
			System.out.println("Introduce la tempretura maxima del dia: ");
			tempMax[cont]=valor.nextInt();
			System.out.println("Introduce la tempretura minima del dia: ");
			tempMin[cont]=valor.nextInt();
			if(tempMax[cont]!=0 && tempMin[cont]!=0) {
				if (tempMax[cont]>=tempMin[cont]) {
				mitjanaMaxima=mitjanaMaxima+tempMax[cont];
				mitjanaMinima=mitjanaMinima+tempMin[cont];
				if (tempMax[cont]>MAX || tempMax[cont]<MIN) {
					nombreErrors++;
				}
				if (tempMin[cont]>MAX ||tempMin[cont]<MIN) {
					nombreErrors++;
				}
				cont++;
				}
				else {
					System.out.println("Error, es imposible que la temperatura minima sea más grande que la temperatura maxima");
				}
			}
			else {
				continuar=false;
				cont++;
			}
		}
		mitjanaMaxima/=cont;
		mitjanaMinima/=cont;
		System.out.println("La mitjana de les temperatures maximes es "+mitjanaMaxima+" ºC");
		System.out.println("La mitjana de les temperatures minimes es "+mitjanaMinima+" ºC");
		System.out.println("El numero de errors a l'hora d'introduir la temperatura es de "+nombreErrors);
		if (nombreErrors>0) {
		percentatge=(nombreErrors*100)/(dies*2);
		System.out.println("El percentatge d‟errors respecte al total de temperatures que es tenen "+percentatge+" %");
		}
		valor.close();
	}

}
