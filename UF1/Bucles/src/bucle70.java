import java.util.Scanner;
public class bucle70 {

	public static void main(String[] args) {
		int numero1=(int)(Math.random()*(100-1+1))+1;
		int numero2=(int)(Math.random()*(100-1+1))+1;
		int numeroaDivinar,numeroPosat;
		boolean continuar=true;
		boolean partida=false;
		Scanner valor=new Scanner(System.in);
		numeroaDivinar= numero1*numero2;
	 while (continuar==true) {
		 	if (continuar==true && partida==true) {
		 		numero1=(int)(Math.random()*(100-1+1))+1;
				numero2=(int)(Math.random()*(100-1+1))+1;
				numeroaDivinar= numero1*numero2;
		 	}
		 	System.out.println("Quin es el resultat de la multiplicació: "+numero1+" * "+numero2);
			numeroPosat=valor.nextInt();
		 if (numeroPosat == numeroaDivinar) {
			 System.out.println("Felicitats has encertat el resultat");
			 System.out.println("Vols fer una altre partida?");
			 partida=valor.nextBoolean();
			 if (partida==false) {
				 continuar=false;
			 }
		 }
		 else {
			 System.out.println("No has encertat el numero");
			 partida=false;
		 }
	 }
	}

}
