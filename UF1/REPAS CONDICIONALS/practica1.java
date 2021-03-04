import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class practica1 {
	practica1(int numfilas,int numcolumnas,int cont,String [][] taula2,String [] col) {
	JFrame f=new JFrame("Generacion "+cont);
	f.setSize(400,400);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container contenedor=f.getContentPane();
	JTable tablero=new JTable(taula2,col);
	
	/*ListSelectionModel select=tablero.getSelectionModel();
	select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	select.addListSelectionListener(new ListSelectionListener() {
		@Override
		public void valueChanged(ListSelectionEvent e) {
			int [] row=tablero.getSelectedRows();
			int [] columns=tablero.getSelectedColumns();
			for (int i = 0; i < row.length; i++) {  
                for (int j = 0; j < columns.length; j++) {  
                	
                } }  
			
		}
	});*/
	
	f.add(tablero);
	}
	public static void main(String[] args) {
	int cont=1;
	informacion(cont);

	
	}
	public static void informacion(int cont) {
		JFrame f=new JFrame();
		Container contenedor=f.getContentPane();
		contenedor.setBackground(Color.orange);
		//contenedor.setLayout(new FlowLayout());
		JLabel numfila=new JLabel("Numero de filas:");
		JTextField filasValor=new JTextField(5);
		JLabel numcol=new JLabel("Numero de columnas:");
		JTextField columnasValor=new JTextField(5);
		JButton boton=new JButton("Iniciar");
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gl= new GridLayout(3,1);
		gl.setHgap(15);
		gl.setVgap(15);
		contenedor.setLayout(gl);
		//contenedor.setLayout(new FlowLayout());
		contenedor.add(numfila);
		contenedor.add(filasValor);
		contenedor.add(numcol);
		contenedor.add(columnasValor);
		contenedor.add(boton);
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int numfilas=Integer.parseInt(filasValor.getText());
				int numcol=Integer.parseInt(columnasValor.getText());
				IntroducirCelulas(numfilas,numcol,cont);
				f.setVisible(false);
			}
		});
		
	}
	public static void IntroducirCelulas(int numfilas,int numcolumnas,int cont) {
		JFrame f=new JFrame();
		f.setBackground(Color.RED);
		f.setSize(400,400);
		f.setVisible(true);
		GridLayout gl= new GridLayout(6,2);
		gl.setHgap(10);
		gl.setVgap(10);
		f.setLayout(gl);
		JButton boton=new JButton("Cargar celulas");
		//Celula 1
		JLabel celula1=new JLabel("Celula 1:");
		JLabel fila=new JLabel("Fila:");
		JTextField fila1Valor=new JTextField(5);
		JLabel col=new JLabel("Columna: ");
		JTextField columnas1Valor=new JTextField(5);
		f.add(celula1);
		f.add(fila);
		f.add(fila1Valor);
		f.add(col);
		f.add(columnas1Valor);
		//Celula 2
		JLabel celula2=new JLabel("Celula 2:");
		JLabel fila2=new JLabel("Fila:");
		JTextField fila2Valor=new JTextField(5);
		JLabel col2=new JLabel("Columna: ");
		JTextField columnas2Valor=new JTextField(5);
		f.add(celula2);
		f.add(fila2);
		f.add(fila2Valor);
		f.add(col2);
		f.add(columnas2Valor);
		
		JLabel celula3=new JLabel("Celula 3:");
		JLabel fila3=new JLabel("Fila:");
		JTextField fila3Valor=new JTextField(5);
		JLabel col3=new JLabel("Columna: ");
		JTextField columnas3Valor=new JTextField(5);
		f.add(celula3);
		f.add(fila3);
		f.add(fila3Valor);
		f.add(col3);
		f.add(columnas3Valor);
		
		JLabel celula4=new JLabel("Celula 4:");
		JLabel fila4=new JLabel("Fila:");
		JTextField fila4Valor=new JTextField(5);
		JLabel col4=new JLabel("Columna: ");
		JTextField columnas4Valor=new JTextField(5);
		f.add(celula4);
		f.add(fila4);
		f.add(fila4Valor);
		f.add(col4);
		f.add(columnas4Valor);
		
		JLabel celula5=new JLabel("Celula 5:");
		JLabel fila5=new JLabel("Fila:");
		JTextField fila5Valor=new JTextField(5);
		JLabel col5=new JLabel("Columna: ");
		JTextField columnas5Valor=new JTextField(5);
		f.add(celula5);
		f.add(fila5);
		f.add(fila5Valor);
		f.add(col5);
		f.add(columnas5Valor);
		
		f.add(boton);
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int fila1=Integer.parseInt(fila1Valor.getText()),col1=Integer.parseInt(columnas1Valor.getText());
				int fila2=Integer.parseInt(fila2Valor.getText()),col2=Integer.parseInt(columnas2Valor.getText());
				int fila3=Integer.parseInt(fila3Valor.getText()),col3=Integer.parseInt(columnas3Valor.getText());
				int fila4=Integer.parseInt(fila4Valor.getText()),col4=Integer.parseInt(columnas4Valor.getText());
				int fila5=Integer.parseInt(fila5Valor.getText()),col5=Integer.parseInt(columnas5Valor.getText());
				rellenar_variable(numfilas,numcolumnas,fila1,col1,fila2,col2,fila3,col3,fila4,col4,fila5,col5,cont);
				
			}
		});
	}
	public static void rellenar_variable(int numfilas,int numcolumnas,int fila1,int col1,int fila2,int col2,int fila3,int col3,int fila4,int col4,int fila5,int col5,int cont) {
		String [][] taula=new String[numfilas][numcolumnas];
		JLabel[][] color=new JLabel[numfilas][numcolumnas];
		String [][] taula2=new String[numfilas][numcolumnas];
		String [] col=new String[numcolumnas];
		for (int fila=0;fila<numfilas;fila++) {
			for (int colu=0;colu<numcolumnas;colu++) {
				taula[fila][colu]=" ";
				//color[fila][colu].setBackground(Color.RED);
				taula2[fila][colu]=" ";
				col[colu]=" ";
			}
		}
		
		taula[fila1][col1]="#";
		taula[fila2][col2]="#";
		taula[fila3][col3]="#";
		taula[fila4][col4]="#";
		taula[fila5][col5]="#";
		
		//for (int cont1=0;cont1<3;cont1++) {
		//comprovarCelulesVives(numfilas,numcolumnas,taula,taula2);
		imprimir(numfilas,numcolumnas,cont,taula2,col,taula,color);
		cont++;
	
		//borrallista(numfilas,numcolumnas,taula,taula2);
		
		//}
	}
	
	public static void imprimir(int numfilas,int numcolumnas,int cont,String [][] taula2,String [] col,String[][]taula,JLabel [][] colores) {
		JFrame f=new JFrame("Generacion "+cont);
		JButton boton=new JButton("Sigiente");
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contenedor=f.getContentPane();
		contenedor.setBackground(Color.black);
		GridLayout gl= new GridLayout(2,1);
		gl.setHgap(10);
		gl.setVgap(10);
		contenedor.setLayout(gl);
		comprovarCelulesVives(numfilas,numcolumnas,taula,taula2);
		JTable tablero=new JTable(taula2,col);
		int fila=tablero.getRowCount();
		int i;
		tablero.setBackground(Color.black);
		
		for(i=0;i<fila;i++) {
			String valor=(String) tablero.getValueAt(i,0);
			//tablero.getCellEditor(i,0);
			if (valor.equals("#")) {
				tablero.setBackground(Color.red);
			}
			else {
		
			}
		}
		
		f.add(tablero);
		f.add(boton);
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//borrallista(numfilas,numcolumnas,taula,taula2);
				for (int fila=0;fila<numfilas;fila++) {
					for (int col=0;col<numcolumnas;col++) {
						taula[fila][col]=taula2[fila][col];
						taula2[fila][col]=" ";
					}
				}
				comprovarCelulesVives(numfilas,numcolumnas,taula,taula2);
				JTable tablero2=new JTable(taula2,col);
				tablero2.setVisible(true);
				f.add(tablero2);
				tablero.setVisible(false);
				boton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						for (int fila=0;fila<numfilas;fila++) {
							for (int col=0;col<numcolumnas;col++) {
								taula[fila][col]=taula2[fila][col];
								taula2[fila][col]=" ";
							}
						}
						comprovarCelulesVives(numfilas,numcolumnas,taula,taula2);
						JTable tablero3=new JTable(taula2,col);
						tablero3.setVisible(true);
						f.add(tablero2);
						tablero2.setVisible(false);
					}
				});
			}
		});

		
	}
	public static void  comprovarCelulesVives(int n,int n2,String [][] generacio1,String[][] generacio2) {
		int numsum=0;
		for (int fila=0;fila<n;fila++) {
			for (int col=0;col<n2;col++) {
				numsum=0;
				//FILTRES PER SAVER SI LA POSICIO A INSERIR ES CORRECTE TENINT EN COMPTE ELS MARGES
				if (fila==0 && (col!=0 && col!=(n2-1))) {
					for (int cont=fila;cont<=(fila+1);cont++) {
						for (int cols=(col-1);cols<=(col+1);cols++) {
							if (generacio1[cont][cols]=="#" && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (fila==(n-1) && (col!=0 && col!=(n2-1))) {
					for (int cont=(fila-1);cont<=fila;cont++) {
						for (int cols=(col-1);cols<=(col+1);cols++) {
							if (generacio1[cont][cols]=="#" && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==0 && (fila!=(n-1) && fila!=0)) {
					for (int cont=(fila-1);cont<=(fila+1);cont++) {
						for (int cols=col;cols<=(col+1);cols++) {
							if (generacio1[cont][cols]=="#" && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==(n2-1) && (fila!=(n-1) && fila!=0)) {
					for (int cont=(fila-1);cont<=(fila+1);cont++) {
						for (int cols=(col-1);cols<=col;cols++) {
							if (generacio1[cont][cols]=="#" && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==(n2-1) && fila==(n-1)) {
					for (int cont=(fila-1);cont<=fila;cont++) {
						for (int cols=(col-1);cols<=col;cols++) {
							if (generacio1[cont][cols]=="#" && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==(n2-1) && fila==0) {
					for (int cont=fila;cont<=(fila+1);cont++) {
						for (int cols=(col-1);cols<=col;cols++) {
							if (generacio1[cont][cols]=="#" && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==0 && fila==(n-1)) {
					for (int cont=(fila-1);cont<=fila;cont++) {
						for (int cols=col;cols<=(col+1);cols++) {
							if (generacio1[cont][cols]=="#" && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (col==0 && fila==0) {
					for (int cont=fila;cont<=(fila+1);cont++) {
						for (int cols=col;cols<=(col+1);cols++) {
							if (generacio1[cont][cols]=="#" && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				
				else if (fila==(n-1) && col==(n2-1)) {
					for (int cont=(fila-1);cont<=fila;cont++) {
						for (int cols=(col-1);cols<=col;cols++) {
							if (generacio1[cont][cols]=="#" && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
				//CAS GENERAL
				else {
				for (int cont=(fila-1);cont<=(fila+1);cont++) {
						for (int cols=(col-1);cols<=(col+1);cols++) {
							if (generacio1[cont][cols]=="#" && (cont!=fila || cols!=col)) {
								numsum++;
							}
						}
					}
				}
			comprovarcelulaviva(numsum,fila,col,generacio2,generacio1);
			
			}
		}
	}
	public static void comprovarcelulaviva(int numsum,int fila,int col,String [][]generacio2,String [][]generacio1) {
		if ((numsum==3 || numsum==2) && generacio1[fila][col]=="#") {
			generacio2[fila][col]="#";
		}
		else if (numsum==3 && generacio1[fila][col]==" ") {
			generacio2[fila][col]="#";
		}
		else if (numsum>3 || numsum<2) {
			generacio2[fila][col]=" ";
		}	
	}
	public static void borrallista(int n,int n2,String [][]generacio1,String [][]generacio2) {
		for (int fila=0;fila<n;fila++) {
			for (int col=0;col<n2;col++) {
		
				generacio1[fila][col]=generacio2[fila][col];
				generacio2[fila][col]=" ";
			}
		}
	}
}

