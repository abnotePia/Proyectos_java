package Arrays_1_dimensio;
import java.util.Scanner;
public class LineasDeMetro {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		char opcions;
		int linea,cont2=0;
		String [] Paradas1={"Arc de Triomf","Av.Carrilet","Baró de Viver","Belvitge","Can Serra","Catalunya","Clot","Espanya","Fabra i Puíg","Florida","Fondo","Glories","Hospital de Bellvitge","Hostafrancs","Marína","Mercat Nou","Navas","Plaça de Sants","Rambla Just Oliveras","Rocafort","Sagrera","Sant Andreu","Santa Coloma","Santa Eulália","Torras i Bages","Torrassa","Trinitat Vella","Universitat","Urgell","Urquinaona"};
		String [] Paradas2= {"Canyelles","Catalunya","Diagonal","Drassenes","Espanya","Fontana","Les Corts","Lesseps","Liceu","María Cristina","Montbau","Mundet","Palau Reial","Paral.lel","Passeig de Gràcia","Penitents","Plaça de Sants","Poble Sec","Roquetes","Sants Estació","Tarragona","Trinitat Nova","Vall d´Hebron","Vallcarca","Valldaura","Zona Universitària"};
		String [] Paradas3= {"Badal","Camp de l´Arpa","Virrei Amat","Can Boixeres","Can Videlet","Collblanc","Congrés","Cornellà","Centre Diagonal","El Carmel","Entença","Gavarra","Horta","Hospital Clínic","La Sagrera","La Teixonera","Maragall","Plaça de Sants","Pubila Cases","Sagrada Familia","Sant Ildefons Sant Pau","Dos de Maig","Sats Estació","Vall d´Hebron","Verdaguer","Vilapicina"};
		String [] lineaBlava;
		String[] lineaVerda;
		String [] lineaVermella;
		lineaVermella=new String [30];
		lineaVerda=new String[26];
		lineaBlava=new String[26];
		boolean carregar=false,acabar=true;
		do {
		System.out.println ("a.- Carregar dades de les línies de metro\r\n"
				+ "b.- Imprimir les parades d’una línia de metro triada\r\n"
				+ "c.- Finalitzar");
		opcions=valor.next().charAt(0);
		switch(opcions) {
		case 'a':
			for (int cont=0;cont<30;cont++) {
				lineaVermella[cont]=Paradas1[cont];
			}
			for (int cont=0;cont<26;cont++) {
				lineaVerda[cont]=Paradas2[cont];
			}
			for (int cont=0;cont<26;cont++) {
				lineaBlava[cont]=Paradas3[cont];
			}
			carregar=true;
			break;
		case 'b':
			if (carregar==true) {
				System.out.println("Selecciona quines lineas desitjes\n1.Vermella\n3.Verda\n5.Blava");
				linea=valor.nextInt();
				switch (linea) {
				case 1:
					for (int cont=0;cont<30;cont++) {
						cont2=0;
						System.out.print(lineaVermella[cont]);
						while (cont2!=26) {
						if (lineaVermella[cont].equals(lineaVerda[cont2])) {
							System.out.print("--Linea Verda");
						}
						if (lineaVermella[cont].equals(lineaBlava[cont2])) {
							System.out.print("--Linea Blava");
							}
						cont2++;
						}
						System.out.println(" ");
					}
					break;
				case 3:
					for (int cont=0;cont<26;cont++) {
						cont2=0;
						System.out.print(lineaVerda[cont]);
						while (cont2<30) {
							if (lineaVerda[cont].equals(lineaVermella[cont2])) {
								System.out.print("--Linea Vermella");
							}
							cont2++;
						}
						cont2=0;
						while (cont2<26) {
							if (lineaVerda[cont].equals(lineaBlava[cont2])) {
								System.out.print("--Linea Blava");
							}
							cont2++;
						}
						System.out.println(" ");
					}
					break;
				case 5:
					for (int cont=0;cont<26;cont++) {
						System.out.print(lineaBlava[cont]);
						cont2=0;
						while (cont2<26) {
							if (lineaBlava[cont].equals(lineaVerda[cont2])) {
								System.out.print("--Linea Verda");
							}
							cont2++;
						}
						cont2=0;
						while (cont2<30) {
							if (lineaBlava[cont].equals(lineaVermella[cont2])) {
								System.out.print("--Linea Vermella");
							}
							cont2++;
						}
						System.out.println(" ");
					}
					break;
				default:
					System.out.println("No has introduit cap linea correcte");
					break;
				}
			}
			else {
				System.out.println("Error! No s'han carregat les dades!");
			}
			break;
		case 'c':
			acabar=false;
			break;
		default:
			System.out.println("Opcio introduida no valida, introdueix una altre");
			break;
		}
		}while(acabar==true);
		valor.close();
	}

}
