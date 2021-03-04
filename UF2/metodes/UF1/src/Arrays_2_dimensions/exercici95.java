package Arrays_2_dimensions;
import java.util.Scanner;
public class exercici95 {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		int [] codiAlumnes=new int[30];
		int codiAssignatura,cont=0;		
		codiAlumnes[0]=1;
		double [][] Notas=new double[31][5];
		do {
			System.out.println("Introdueix el codi de l'alumne");
			codiAlumnes[cont]=valor.nextInt();
			while (codiAlumnes[cont]>31 || codiAlumnes[cont]<0) {
				if (codiAlumnes[cont]>31 || codiAlumnes[cont]<0) {
					System.out.println("Introdueix el codi de l'alumne");
					codiAlumnes[cont]=valor.nextInt();
				}
			}
			
		cont++;} while (codiAlumnes[cont-1]!=0);
		cont--;
		int cont2=cont;
		double [] mitjana=new double[5];
		double [] mitjanaAlumnes=new double[30];
		int [] aprobats=new int[5];
		int [] suspes=new int[5];
		double [] notamaximaAlumnes=new double [10];
		double [] notaminimaAlumnes=new double[10];
		double AssignaturaMitjanaMin=0;
		int Assignaturamin=0;
		for (codiAssignatura=0;codiAssignatura<5;codiAssignatura++) {
				cont2=cont;
				for(int filas=0;filas<cont;filas++) {
					System.out.println("Introduce la nota del codigo del alumno: "+codiAlumnes[filas]+" con el codigo de la assignatura es: "+codiAssignatura);
					Notas[filas][codiAssignatura]=valor.nextDouble();
					//CONTAR APROBATS I SUSPESOS DE CADA ALUMNE
					if (Notas[filas][codiAssignatura]>=5) {
						aprobats[filas]++;
					}
					else if (Notas[filas][codiAssignatura]<5 && Notas[filas][codiAssignatura]>=0) {
						suspes[filas]++;
					}
					//CALCULAR MITJANA ASSIGNATURA I DEL ALUMNE
					if (Notas[filas][codiAssignatura]==-1) {
						cont2--;
						mitjana[codiAssignatura]+=0;
						mitjanaAlumnes[filas]+=0;
					}
					else {mitjana[codiAssignatura]+=Notas[filas][codiAssignatura];
					mitjanaAlumnes[filas]+=Notas[filas][codiAssignatura];
					}
					
				}
	
				//Obtenir nota mes gran i mes petita de alumnes de la assignatura 
				for (int filas=0;filas<cont;filas++) {
					if (filas==0) {
						if (Notas[filas][codiAssignatura]==-1) {
							notaminimaAlumnes[codiAssignatura]=10;
						}
						else {
							notaminimaAlumnes[codiAssignatura]=Notas[filas][codiAssignatura];}
					}
						if (Notas[filas][codiAssignatura]<notaminimaAlumnes[codiAssignatura] && Notas[filas][codiAssignatura]!=-1) {
							notaminimaAlumnes[codiAssignatura]=Notas[filas][codiAssignatura];
						}
						if (Notas[filas][codiAssignatura]>notaminimaAlumnes[codiAssignatura]) {
							notamaximaAlumnes[codiAssignatura]=Notas[filas][codiAssignatura];
						}
				}
				System.out.println("La nota més gran de l'assignatura amb codi "+codiAssignatura+" es "+notamaximaAlumnes[codiAssignatura]);
				System.out.println("La nota més petita de l'assignatura amb codi "+codiAssignatura+" es "+notaminimaAlumnes[codiAssignatura]);
				//Mitjana de cada assignatura
				if (cont2>0) {
					mitjana[codiAssignatura]/=cont2;
					System.out.println("La nota mitjana de la assignatura amb el codi "+codiAssignatura+" es "+mitjana[codiAssignatura]);
					} else {
						System.out.println("No es pot calcular la mitjana de la assignatura amb el codi "+codiAssignatura+" ja que no hi ha cap alumne matriculat");
					}
				//OBTENIR LA ASSIGNATURA AMB LA MITJANA MÉS PETITA
				if (codiAssignatura==0) {
					AssignaturaMitjanaMin=mitjana[codiAssignatura]/cont2;
					Assignaturamin=codiAssignatura;
				}
				else if (AssignaturaMitjanaMin>(mitjana[codiAssignatura]/cont2)){
					AssignaturaMitjanaMin=mitjana[codiAssignatura]/cont2;
					Assignaturamin=codiAssignatura;
				}
				if (codiAssignatura==4) {
					System.out.println("\nLa mitjana més petita es "+AssignaturaMitjanaMin+" de la assignatura amb codi "+Assignaturamin);
					
				}
			}
			//CALCULAR LA NOTA MITJANA DE CADA ALUMNE
			cont2=5;
			for (int filas=0;filas<cont;filas++) {
				if (Notas[filas][0]==-1) {
					cont2--;
					}
				mitjanaAlumnes[filas]/=cont2;
				System.out.println("La nota mitjana del alumne "+codiAlumnes[filas]+" es "+mitjanaAlumnes[filas]);
				System.out.println("Ha aprobat "+aprobats[filas]+" i ha suspes "+suspes[filas]);
			}
			valor.close();
	}

}
