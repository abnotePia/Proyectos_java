package EXERCICIS_METODES_INICIS.JOC_DE_LA_VIDA_VERSIONS;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;


import javax.swing.JFrame;

import javax.swing.JPanel;


public class prueba extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x = 0;
	int y = 0;
	static int  fil=0,col=0;
	public static boolean continuar=true;
	public static int [] x2=new int[5];
	public static int [] y2=new int [5];
	private void moveBall() {
		x = x + 30;
		if (x==300) {
		x=0;
		y = y + 30;
		}
		if (y==300) {
			continuar=false;
		}
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
		g2d.fillRect(x,y, 30, 30);
		g2d.setColor(Color.RED);
		if (col<5) {
		g2d.fillRect(x2[col],y2[col], 30, 30);
		col++;
		}
		//g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
	}
	public static void informacio() {
		Scanner valor=new Scanner(System.in);
		for (int col=0;col<4;col++) {
		System.out.println("Introduce la primera celula x");
		x2[col]=valor.nextInt();
		System.out.println("Introduce la primera celula y");
		y2[col]=valor.nextInt();
		valor.close();
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis");
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba game = new prueba();
		frame.add(game);
		informacio();
		while (continuar==true) {
			game.moveBall();
			game.repaint();
			Thread.sleep(10);
		}
		
		}
}