package metodes;

import java.util.Scanner;

public class joc_de_la_vida {
	public static int MINIM=10;
	public static void main(String[] args) {
		joc_de_la_vida p=new joc_de_la_vida();
		p.principal();
	}
	
	public void principal() {
		Scanner valor=new Scanner(System.in);
		int n=0,n2=0;
		//Comprovar que els valors introduits son mes grans que els minims
		do {
		System.out.println("Numeros de fila");
		n=valor.nextInt();
		System.out.println("Numero de columnas");
		n2=valor.nextInt();
		} while (!minim(n,n2));
		
		int generacion=1;
		boolean [][] generacio1=new boolean[n][n2];
		boolean [][] generacio2=new boolean[n][n2];
		
		//Elegir Metodo de entrada
		if (ModoIntro(valor)) {
			System.out.println("Introduce el numero de colonias");
			int numero_de_colonias=valor.nextInt();
			CelulasAleatoras(n,n2,generacio1,numero_de_colonias);
		}
		else {
			IntroduirCelulesInicials(n,n2,generacio1,valor);
		}
		
		System.out.println("Introduce el numero de generaciones que quieres ver: ");
		int numgeneraciones=valor.nextInt();
		for(int cont2=0;cont2<numgeneraciones;cont2++) {
			comprovararrayvida(generacio1,generacio2,n,n2,generacion,valor);
			imprimirarray(n,n2,generacio2,generacion);
			generacion++;
			borrarSecundaria(generacio2,n,n2,generacio1);
		}
		valor.close();
	}
	
	public boolean minim(int n,int n2) {
		boolean pasable=false;
		if (n>=MINIM && n2>=MINIM) {
			pasable=true;
		}
		else {
			System.out.println("Valors inferiors al minim");
		}
		return pasable;
	}
	
	public boolean ModoIntro(Scanner valor) {
		boolean modoautomatico=false;
		System.out.println("[1].Modo manual\n[2].Modo automatico");
		int manual=valor.nextInt();
		switch (manual){
			case 2:
				modoautomatico=true;
				break;
		}
		return modoautomatico;
	}

	public void IntroduirCelulesInicials(int n,int n2,boolean [][] generacio1,Scanner valor) {
		int cont=0, fila, columna;
		while (cont<5) {
			System.out.println("Indica donde quieres poner la celula "+(cont+1));
			System.out.println("Fila :");
			fila=valor.nextInt();
			if (posicioncorrecta(fila,n)) {
				System.out.println("Columna: ");
				columna=valor.nextInt();
				if (posicioncorrecta(columna,n2)) {
					generacio1[fila][columna]=true;
					cont++;
				}
				else {
					System.out.println("Valor introducido fuera de los limites");
				}
			}
			else {
				System.out.println("Valor introducido fuera de los limites");
			}
		}
	
	}
	
	public void CelulasAleatoras(int n,int n2,boolean [][] generacio1,int numero_de_colonias) {
		for (int cont=0;cont<numero_de_colonias;cont++) {
		int cont2=0; 
		int x=0,y=0;
		//Comprovar que no s'incereixi una colonia alla on a aparegut una altre
		do {
			x=(int)(Math.random()*((n2-2)-1+1))+1;
			y=(int)(Math.random()*((n-2)-1+1))+1;
		}while (!comprovarEspaiVuit(y,x,generacio1));
		
		for (int fila=y-1;fila<=y+1;fila++) {
			for (int col=x-1;col<=x;col++) {
				if (col<=(n2-1) && cont2<5) {
					generacio1[fila][col]=true;
					cont2++;
					}
				}
				x++;
			}
		}
	}
	
	public boolean comprovarEspaiVuit(int y,int x,boolean [][] generacio1) {
		boolean vuit=false;
		if (!generacio1[y][x]) {
			vuit=true;
		}
		return vuit;
	}
		
	public boolean posicioncorrecta(int posicion,int maxim) {
		boolean correcto=false;
		if (posicion<maxim) {
			correcto=true;
		}
		return correcto;
	}
	
	public static String comprovarCondicionsVida(Scanner valor) {
		System.out.println("Canviar condiciones de vida:");
		System.out.println("Con el formato AA/B donde A son las condiciones para sobrevivir y B es la condicion para renacer");
		String condiciones=valor.next();
		return condiciones;
	}
	
	public void comprovararrayvida(boolean [][]generacio1,boolean [][]generacio2,int n,int n2,int generacion,Scanner valor) {
		String condiciones=comprovarCondicionsVida(valor);
		int numsum=0;
		for (int fila=0;fila<n;fila++) {
			for (int col=0;col<n2;col++) {
				numsum=0;
				//FILTRES PER SAVER SI LA POSICIO A INSERIR ES CORRECTE TENINT EN COMPTE ELS MARGES
				if (fila==0 && (col!=0 && col!=(n2-1))) {
					for (int cont=fila;cont<=(fila+1);cont++) {
						for (int cols=(col-1);cols<=(col+1);cols++) {
							if (generacio1[cont][cols]==true && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (fila==(n-1) && (col!=0 && col!=(n2-1))) {
					for (int cont=(fila-1);cont<=fila;cont++) {
						for (int cols=(col-1);cols<=(col+1);cols++) {
							if (generacio1[cont][cols]==true && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==0 && (fila!=(n-1) && fila!=0)) {
					for (int cont=(fila-1);cont<=(fila+1);cont++) {
						for (int cols=col;cols<=(col+1);cols++) {
							if (generacio1[cont][cols]==true && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==(n2-1) && (fila!=(n-1) && fila!=0)) {
					for (int cont=(fila-1);cont<=(fila+1);cont++) {
						for (int cols=(col-1);cols<=col;cols++) {
							if (generacio1[cont][cols]==true && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==(n2-1) && fila==(n-1)) {
					for (int cont=(fila-1);cont<=fila;cont++) {
						for (int cols=(col-1);cols<=col;cols++) {
							if (generacio1[cont][cols]==true && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==(n2-1) && fila==0) {
					for (int cont=fila;cont<=(fila+1);cont++) {
						for (int cols=(col-1);cols<=col;cols++) {
							if (generacio1[cont][cols]==true && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==0 && fila==(n-1)) {
					for (int cont=(fila-1);cont<=fila;cont++) {
						for (int cols=col;cols<=(col+1);cols++) {
							if (generacio1[cont][cols]==true && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==0 && fila==0) {
					for (int cont=fila;cont<=(fila+1);cont++) {
						for (int cols=col;cols<=(col+1);cols++) {
							if (generacio1[cont][cols]==true && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (fila==(n-1) && col==(n2-1)) {
					for (int cont=(fila-1);cont<=fila;cont++) {
						for (int cols=(col-1);cols<=col;cols++) {
							if (generacio1[cont][cols]==true && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				//CAS GENERAL
				else {
				for (int cont=(fila-1);cont<=(fila+1);cont++) {
						for (int cols=(col-1);cols<=(col+1);cols++) {
							if (generacio1[cont][cols]==true && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
			comprovarcelulaviva(numsum,fila,col,generacio2,generacio1,condiciones);
			}
		}
	}

	public void comprovarcelulaviva(int numsum,int fila,int col,boolean [][]generacio2,boolean [][]generacio1,String condiciones) {
		if ((numsum==Character.getNumericValue(condiciones.charAt(0))|| numsum==Character.getNumericValue(condiciones.charAt(1))) && generacio1[fila][col]==true) {
			generacio2[fila][col]=true;
		}
		else if (numsum==Character.getNumericValue(condiciones.charAt(3)) && generacio1[fila][col]==false) {
			generacio2[fila][col]=true;
		}
		else if ((numsum>Character.getNumericValue(condiciones.charAt(0)) && numsum==Character.getNumericValue(condiciones.charAt(1))) || numsum>Character.getNumericValue(condiciones.charAt(3))) {
			generacio2[fila][col]=false;
		}	
	}
	
	public void imprimirarray(int n,int n2,boolean [][] generacio2,int generacion) {
		System.out.println("Genreacion: "+generacion);
		for (int fila=0;fila<n;fila++) {
			for (int col=0;col<n2;col++) {
				System.out.print(generacio2[fila][col]+" ");
			}
			System.out.println(" ");
		}
	}
	
	public void borrarSecundaria(boolean [][]generacio2,int n,int n2,boolean [][]generacio1) {
		for (int fila=0;fila<n;fila++) {
			for (int col=0;col<n2;col++) {
				generacio1[fila][col]=generacio2[fila][col];
				generacio2[fila][col]=false;
			}
		}
	}
}