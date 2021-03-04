import java.util.Scanner;
public class exercici_2 {

	public static void main(String[] args) {
		int opcio=1,numero;
		boolean primer=true;
		Scanner valor=new Scanner(System.in);
		do {
			System.out.println("\n[1].Taula Multiplicar Inversa\n[2].Numeros Primers\n[3].Sortir");
			opcio=valor.nextInt();
			switch (opcio) {
			case 1:
				System.out.println("Introduce un numero");
				numero=valor.nextInt();
				for (int cont=10;cont>0;cont--) {
					System.out.println(numero+"*"+cont+"="+(numero*cont));
				}
				break;
			case 2:
				System.out.println("Introduce un numero");
				numero=valor.nextInt();
				System.out.println("Los numeros primos son: ");
				for (int cont=1;cont<=numero;cont++) {
					primer=true;
					for (int cont2=1;cont2<=cont/2;cont2++) {
						if (cont%cont2==0) {
							if (cont2!=cont && cont2!=1) {
								primer=false;
							}
						}	
					}
					if (primer==true) {
						System.out.print(cont+" ");
					}
				}
				break;
			case 3:
				System.out.println("...\nFin del Programa");
				break;
			default: 
				System.out.println("Opcion introducida no valida");
				break;
			}
			
		}while(opcio!=3);
		valor.close();
	}

}
