import java.util.Scanner;
public class array76 {

	public static void main(String[] args) {
		/*Realitzar un algoritme que donada una taula de N elements, canviï cada element parell per
		l‟element senar anterior. Si la taula té un nombre imparell d‟elements l‟últim no es canvia amb
		ningú. Finalment, mostrar per pantalla la taula modificada.*/ 
		
		//Jo interpreto que s'han de inercanviar les posicions
		int[] numero;
		int[] numeroParell;
		int[] numeroImparell;
		int llarg,cont=0;
		boolean continuar=true;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce cuantos numeros quieres: ");
		llarg=valor.nextInt();
		numero=new int[llarg];
		numeroParell=new int[llarg];
		numeroImparell=new int[llarg];
		// SELECCIONEM QUINS NUMEROS SON PARELLS I QUINS SON IMPARELLS
		while (cont<llarg) {
			System.out.println("Introduce un numero: ");
			numero[cont]=valor.nextInt();
			if (numero[cont]%2==0) {
				numeroParell[cont]=numero[cont];	
		
				}
			else {
				numeroImparell[cont]=numero[cont];
			}
			cont++;
		}
		cont=0;
		//Intercanviem les posicions
		while (cont<llarg) {
			//Si el numero de numeros es imparell 
			//indica que l'ultim numero no es te que canviar
			if (llarg%2!=0 && cont+1 ==llarg) {
				continuar=false;
			}
			// En aquest apartat canvia la posicio
			//del numero parell pel numero imparell
			if (numeroParell[cont]==0 && continuar==true) {
				//Poso aquest condicional per evitar que en l'ultima 
				//itineracio el cont+1 sigui més gran que la dimensio 
				//de l'array i salti error
				if (cont+1!=llarg) {
					if (numero[cont+1]%2==0) { 
						//AIXO ES PER EVITAR QUE CANVI LA POSICIO 
						//ENTRE DOS NUMEROS SI EL SEU SEGUENT ES UN NUMERO IMPARELL
					numero[cont+1]=numeroImparell[cont];
					}
				}
			}
			else if (numeroImparell[cont]==0) {
				//AIXO ES PER EVITAR  CANVIAR ELS 
				//NUMEROS QUAN EL PRIMER ES UN NUMERO PARELL
				if (cont-1!=-1) {
					numero[cont-1]=numeroParell[cont];
					}
			}
			cont++;
		}
			cont=0;
		while (cont<llarg) {
			System.out.println(numero[cont]);
			cont++;
		}
		valor.close();
	}
}
