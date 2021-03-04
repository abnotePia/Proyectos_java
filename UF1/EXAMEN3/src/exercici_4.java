
public class exercici_4 {

	public static void main(String[] args) {
		int cuas [][]=new int [3][20];
		boolean pler=false;
		int [] [] parking=new int [3][20];
		
		//inicialitzar les matricules que hi hauran en les cues
		for (int filas=0;filas<3;filas++) {
			for (int col=0;col<20;col++) {
				cuas[filas][col]=(int)(Math.random()*(20-1+1))+1;
			}
		}
		//Un cop entart el cotxe no pot tornar a entrar
		int nombreItineracions=0;
		while (pler==false) {
			//generar matricula aleatoriament
			int matricula=(int)(Math.random()*(20-1+1))+1;
			nombreItineracions++;
			//Saver quins cotxes poden entrar en el parquing 
			for (int filas=0;filas<3;filas++) {
				for (int col=0;col<20;col++) {
					//controlar que no tornin a entrar els cotxes que ja havien entrat
					if (parking[filas][col]!=cuas[filas][col]) {
						if (cuas[filas][col]<=matricula) {
							parking[filas][col]=cuas[filas][col];
							System.out.println("El coxte que ha entrat pertany a la cua " +(filas+1)+" i la seva matricula es "+cuas[filas][col]);
							if (matricula==20) {
								pler=true;
							}
						}
					}
				}
			}
			
		}
		System.out.println("El sistema ha tardat "+nombreItineracions+" itineracions ha deixar entrar tots els vehicles");
	}
}
