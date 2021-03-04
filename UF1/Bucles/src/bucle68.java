import java.util.Scanner;
public class bucle68 {
	public static void main(String[] args) {
		int numero1=(int)(Math.random()*(100-1+1))+1;
		int numeroEncertat, numerointents;
		Scanner valor=new Scanner(System.in);
		numeroEncertat=0;
		numerointents=0;
		do {
			System.out.println("Introduce un numero del 1-100: ");
			numeroEncertat=valor.nextInt();
			numerointents++;
			if (numeroEncertat==numero1) {
				System.out.println("Felicitats has encertat el numero");
			}
			else {
				if (numeroEncertat<numero1) {
					System.out.println("El numero "+numeroEncertat+ " es més petit que el numero generat per la maquina");
				}
				else {
					System.out.println("El numero "+numeroEncertat+ " es més gran que el numero generat per la maquina");
				}
			}
		} while (numeroEncertat!=numero1);
		System.out.println("Per encertar el numero has necesitat "+numerointents+" intents");
		
	}
}
