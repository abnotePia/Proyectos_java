package Bucles;
import java.util.Scanner;
//DOCUMENT PROVES
public class exemple {
public static void main (String[] args) {  
	int cont,numseguides;
	String nombre;
	cont=0;
	numseguides=0;
	Scanner teclado = new Scanner(System.in);
	nombre = teclado.nextLine();
	char[] arrayChar = nombre.toCharArray();
	while (arrayChar[cont] !='.') {
		if (arrayChar[cont]==arrayChar[0]) {
			if (arrayChar[cont+1]==arrayChar[1]) {
			numseguides++;
			}
		}
		cont++;
	}
	System.out.println("La letra '"+arrayChar[0]+ "' y la letra '"+arrayChar[1]+"' salen seguidas: "+numseguides);
	
	
	    }
      }

