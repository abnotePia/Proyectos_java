package EXERCICIS_METODES_INICIS.JOC_DE_LA_VIDA_VERSIONS;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class juegovisa {
	public static int cont=2;
	public static int numgeneracions=3;
	
	public static void main(String[] args) {
		juegovisa p=new juegovisa();
		int cont=1;
		p.informacion(cont);
		}
	
		public void informacion(int cont) {
			JFrame f=new JFrame("Menu Principal");
			Container contenedor=f.getContentPane();
			contenedor.setBackground(Color.orange);
			//contenedor.setLayout(new FlowLayout());
			JLabel numfila=new JLabel("Numero de filas:");
			JTextField filasValor=new JTextField(5);
			JLabel numcol=new JLabel("Numero de columnas:");
			JTextField columnasValor=new JTextField(5);
			JLabel numgeneraciones=new JLabel("Numero de generaciones:");
			JTextField numgene=new JTextField(5);
			JButton boton=new JButton("Iniciar");
			f.setSize(400,400);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GridLayout gl= new GridLayout(4,1);
			gl.setHgap(15);
			gl.setVgap(15);
			contenedor.setLayout(gl);
			contenedor.add(numfila);
			contenedor.add(filasValor);
			contenedor.add(numcol);
			contenedor.add(columnasValor);
			contenedor.add(numgeneraciones);
			contenedor.add(numgene);
			contenedor.add(boton);
			boton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int numfilas=Integer.parseInt(filasValor.getText());
					int numcol=Integer.parseInt(columnasValor.getText());
					int generaciones=Integer.parseInt(numgene.getText());
					String [][] taula=new String[numfilas][numcol];
					String [][] taula2=new String[numfilas][numcol];
					rellenar(taula,taula2,numfilas,numcol);
					elegirmodo(numfilas,numcol,cont,generaciones,taula,taula2);
					f.setVisible(false);
				}
			});
			
		}
		public  void rellenar(String [][] taula,String [][]taula2,int numfilas,int numcol) {
			for (int fila=0;fila<numfilas;fila++) {
				for(int col=0;col<numcol;col++) {
					taula[fila][col]=" ";
					taula2[fila][col]=" ";
				}
			}
			
			
		}
		
		public  void elegirmodo(int numfilas,int numcol,int cont,int generaciones,String [][] taula,String [][] taula2) {
			JFrame n=new JFrame("Elegir Modo");
			n.setSize(400,400);
			n.setVisible(true);
			n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container contenedor2=n.getContentPane();
			contenedor2.setBackground(Color.orange);
			GridLayout gl= new GridLayout(2,1);
			gl.setHgap(0);
			gl.setVgap(0);
			contenedor2.setLayout(gl);
			JButton manual=new JButton("Modo Manual");
			manual.setBackground(Color.blue);
			manual.setForeground(Color.red);
			JButton automatico=new JButton("Modo Automatico");
			automatico.setBackground(Color.yellow);
			automatico.setForeground(Color.green);
			n.add(manual);
			n.add(automatico);
			manual.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {					
					IntroducirCelulas(numfilas,numcol,cont,generaciones,taula,taula2);
					n.setVisible(false);
				}
			});
			automatico.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {					
					CelulasAleatoras(numfilas,numcol,taula,taula2,generaciones);
					n.setVisible(false);
				}
			});
		}
		
		public  void CelulasAleatoras(int numfilas,int numcol,String[][]taula,String[][]taula2,int generaciones) {
			JFrame n=new JFrame("Colonias");
			n.setSize(400,400);
			n.setVisible(true);
			Container contenedor2=n.getContentPane();
			contenedor2.setBackground(Color.orange);
			GridLayout gl= new GridLayout(4,1);
			gl.setHgap(15);
			gl.setVgap(15);
			contenedor2.setLayout(gl);
			JLabel colonias=new JLabel("Numero de colonias: ");
			JTextField numcolonias=new JTextField(5);
			JButton boton=new JButton("Iniciar");
			contenedor2.add(colonias);
			contenedor2.add(numcolonias);
			contenedor2.add(boton);
			
			boton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for (int cont=0;cont<Integer.parseInt(numcolonias.getText());cont++) {
						int cont2=0; 
						int x=0,y=0;
						//Comprovar que no s'incereixi una colonia alla on a aparegut una altre
						do {
							x=(int)(Math.random()*((numcol-2)-1+1))+1;
							y=(int)(Math.random()*((numfilas-2)-1+1))+1;
						}while (!comprovarEspaiVuit(y,x,taula));
						
						for (int fila=y-1;fila<=y+1;fila++) {
							for (int col=x-1;col<=x;col++) {
								if (col<=(numcol-1) && cont2<5) {
									taula[fila][col]="█";
									cont2++;
									}
								}
								x++;
							}
						}
					imprimir(numfilas,numcol,taula2,taula,generaciones);
				}
			});
			
		}
		public  boolean comprovarEspaiVuit(int y,int x,String [][] taula) {
			boolean vuit=false;
			if (taula[y][x]==" ") {
				vuit=true;
			}
			return vuit;
		}
		public void IntroducirCelulas(int numfilas,int numcolumnas,int cont,int generaciones,String[][]taula,String[][]taula2) {
			JFrame f=new JFrame();
			f.setBackground(Color.RED);
			f.setSize(400,400);
			f.setVisible(true);
			GridLayout gl= new GridLayout(6,2);
			gl.setHgap(10);
			gl.setVgap(10);
			f.setLayout(gl);
			JButton boton=new JButton("Cargar celulas");
			JTextField [] filas=new JTextField[6];
			JTextField [] columnas=new JTextField[6];
			for (int i=1;i<6;i++) {
				filas[i]=new JTextField(5);
				columnas[i]=new JTextField(5);
				JLabel celula1=new JLabel("Celula "+i);
				JLabel fila=new JLabel("Fila:");
				JLabel col=new JLabel("Columna: ");
				f.add(celula1);
				f.add(fila);
				f.add(filas[i]);
				f.add(col);
				f.add(columnas[i]);
			}
			f.add(boton);
			boton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int [] fila1=new int[6];
					int [] col1=new int[6];
					for (int c=1;c<6;c++) {
					fila1[c]=Integer.parseInt(filas[c].getText());
					col1[c]=Integer.parseInt(columnas[c].getText());
					}
					rellenar_variable(numfilas,numcolumnas,fila1,col1,cont,generaciones,taula,taula2);
				}
			});
		}
		
		public void rellenar_variable(int numfilas,int numcolumnas,int [] fila1,int []columna,int cont,int generaciones,String [][]taula,String[][]taula2) {
			for (int i=1;i<6;i++) {
				taula[fila1[i]][columna[i]]="█";
			}
			imprimir(numfilas,numcolumnas,taula2,taula,generaciones);
			cont++;
		}
		
		public void imprimir(int numfilas,int numcolumnas,String [][] taula2,String[][]taula,int generaciones) {
			for (int i=1;i<=generaciones;i++) {
			JFrame f=new JFrame("Generacion "+i);
			f.setSize(400,400);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container contenedor=f.getContentPane();
			contenedor.setBackground(Color.black);
			JLabel [][] pantalla=new JLabel[numfilas][numcolumnas];
			GridLayout gl= new GridLayout(numfilas+1,numcolumnas+1);
			gl.setHgap(10);
			gl.setVgap(10);
			contenedor.setLayout(gl);
			comprovarCelulesVives(numfilas,numcolumnas,taula,taula2);
			establecercolorcelula(numfilas,numcolumnas,pantalla,taula2,f);
			borrallista(numfilas,numcolumnas,taula,taula2);
			}	
		}
		
		public void establecercolorcelula(int numfilas,int numcolumnas,JLabel [][] pantalla,String [][]taula2, JFrame f) {
			for (int fil=0;fil<numfilas;fil++) {
				for (int colu=0;colu<numcolumnas;colu++) {
					pantalla[fil][colu]=new JLabel(taula2[fil][colu]);
					if (taula2[fil][colu].equals("█")) {
						pantalla[fil][colu].setForeground(Color.red);
					}
					f.add(pantalla[fil][colu]);
				}
			}
		}
		public void  comprovarCelulesVives(int n,int n2,String [][] generacio1,String[][] generacio2) {
			int numsum=0;
			for (int fila=0;fila<n;fila++) {
				for (int col=0;col<n2;col++) {
					numsum=0;
					//FILTRES PER SAVER SI LA POSICIO A INSERIR ES CORRECTE TENINT EN COMPTE ELS MARGES
					if (fila==0 && (col!=0 && col!=(n2-1))) {
						for (int cont=fila;cont<=(fila+1);cont++) {
							for (int cols=(col-1);cols<=(col+1);cols++) {
								if (generacio1[cont][cols]=="█" && (cont!=fila || cols!=col)) {
									numsum++;
								}
							}
						}
					}

					else if (fila==(n-1) && (col!=0 && col!=(n2-1))) {
						for (int cont=(fila-1);cont<=fila;cont++) {
							for (int cols=(col-1);cols<=(col+1);cols++) {
								if (generacio1[cont][cols]=="█" && (cont!=fila || cols!=col)) {
									numsum++;
								}
							}
						}
					}
					
					else if (col==0 && (fila!=(n-1) && fila!=0)) {
						for (int cont=(fila-1);cont<=(fila+1);cont++) {
							for (int cols=col;cols<=(col+1);cols++) {
								if (generacio1[cont][cols]=="█" && (cont!=fila || cols!=col)) {
									numsum++;
								}
							}
						}
					}
					
					else if (col==(n2-1) && (fila!=(n-1) && fila!=0)) {
						for (int cont=(fila-1);cont<=(fila+1);cont++) {
							for (int cols=(col-1);cols<=col;cols++) {
								if (generacio1[cont][cols]=="█" && (cont!=fila || cols!=col)) {
									numsum++;
								}
							}
						}
					}
					
					else if (col==(n2-1) && fila==(n-1)) {
						for (int cont=(fila-1);cont<=fila;cont++) {
							for (int cols=(col-1);cols<=col;cols++) {
								if (generacio1[cont][cols]=="█" && (cont!=fila || cols!=col)) {
									numsum++;
								}
							}
						}
					}
					
					else if (col==(n2-1) && fila==0) {
						for (int cont=fila;cont<=(fila+1);cont++) {
							for (int cols=(col-1);cols<=col;cols++) {
								if (generacio1[cont][cols]=="█" && (cont!=fila || cols!=col)) {
									numsum++;
								}
							}
						}
					}
					
					else if (col==0 && fila==(n-1)) {
						for (int cont=(fila-1);cont<=fila;cont++) {
							for (int cols=col;cols<=(col+1);cols++) {
								if (generacio1[cont][cols]=="█" && (cont!=fila || cols!=col)) {
									numsum++;
								}
							}
						}
					}
					
					else if (col==0 && fila==0) {
						for (int cont=fila;cont<=(fila+1);cont++) {
							for (int cols=col;cols<=(col+1);cols++) {
								if (generacio1[cont][cols]=="█" && (cont!=fila || cols!=col)) {
									numsum++;
								}
							}
						}
					}
					
					else if (fila==(n-1) && col==(n2-1)) {
						for (int cont=(fila-1);cont<=fila;cont++) {
							for (int cols=(col-1);cols<=col;cols++) {
								if (generacio1[cont][cols]=="█" && (cont!=fila || cols!=col)) {
									numsum++;
								}
							}
						}
					}
					//CAS GENERAL
					else {
					for (int cont=(fila-1);cont<=(fila+1);cont++) {
							for (int cols=(col-1);cols<=(col+1);cols++) {
								if (generacio1[cont][cols]=="█" && (cont!=fila || cols!=col)) {
									numsum++;
								}
							}
						}
					}
				comprovarcelulaviva(numsum,fila,col,generacio2,generacio1);
				
				}
			}
		}
		public void comprovarcelulaviva(int numsum,int fila,int col,String [][]generacio2,String [][]generacio1) {
			if ((numsum==3 || numsum==2) && generacio1[fila][col]=="█") {
				generacio2[fila][col]="█";
			}
			else if (numsum==3 && generacio1[fila][col]==" ") {
				generacio2[fila][col]="█";
			}
			else if (numsum>3 || numsum<2) {
				generacio2[fila][col]=" ";
			}	
		}
		public void borrallista(int numfilas,int numcolumnas,String [][] taula,String [][]taula2) {
			for (int fila=0;fila<numfilas;fila++) {
				for (int colu=0;colu<numcolumnas;colu++) {
					taula[fila][colu]=taula2[fila][colu];
					taula2[fila][colu]=" ";
				}
			}
		}
}
