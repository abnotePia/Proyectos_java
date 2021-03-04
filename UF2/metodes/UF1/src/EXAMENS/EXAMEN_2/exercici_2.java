package EXAMENS.EXAMEN_2;
import java.util.Scanner;
public class exercici_2 {

	public static void main(String[] args) {
		String paraula=" ",continuar="Y",paraulaIncompleta="_";
		String fiJoc="PENJAT";
		String lletra="";
		char lletra2=' ';
		int lletresIntro=0,error=0,cont6=0;
		boolean repe=true,fijoc=true,entrat=false;
		Scanner valor=new Scanner(System.in);
		do {
		while (repe==true) {
		System.out.println("Introduce una palabra:");
		paraula=valor.nextLine();
		for (int cont5=0;cont5<paraula.length()-1;cont5++) {
			paraulaIncompleta=paraulaIncompleta+" _ ";
		}
		System.out.println(paraulaIncompleta);
			if (paraula.length()>10) {
				System.out.println("Has introducido una palabra de más de 10 caracteres");
				repe=true;;
			}
			else {
				repe=false;
			}
		}
		while (cont6<paraula.length() && fijoc==true) {
			System.out.println("\n¿QUE LETRA QUIERES?");
			lletra=valor.nextLine();
			lletra2=lletra.charAt(0);
			entrat=false;
			for (int cont=cont6,i=paraula.length()-1;cont<paraula.length();cont++) {
				if (paraula.charAt(cont)==lletra2) {
					paraulaIncompleta=paraulaIncompleta.replaceFirst("_", lletra);
					lletresIntro++;
					if (entrat==false) {
					cont6++;
					entrat=true;
					System.out.println(paraulaIncompleta);
					}
				}
				else if (entrat==false && paraula.charAt(cont)!=lletra2) {
				System.out.println("La lletra indicada no existeix.");
					System.out.print("Estas  ");
					for (int cont3=0;cont3<error;cont3++) {
						System.out.print(fiJoc.charAt(error));
					}
					lletresIntro++;
					error++;
				}
				if (paraula.equals(paraulaIncompleta) || error==6) {
					System.out.println("La paraula a quedat aixi:"+paraulaIncompleta+" ho has fet amb "+lletresIntro+" intents");
					System.out.println("La paraula penjat a quedat aixi: ");
					for (int cont4=0;cont<error;cont++) {
						System.out.print(fiJoc.charAt(cont4));
					}
					System.out.println("Vols tornar a jugar introdueix Y per tornar a jugar o introdueix N per finalitzar");
					continuar=valor.nextLine();
					repe=true;
				}
			}
		}
		}while(continuar.equals("Y"));
		valor.close();
	}

}
