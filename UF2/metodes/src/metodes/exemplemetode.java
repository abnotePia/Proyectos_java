package metodes;

public class exemplemetode {
	//Aqui es poden posar totes les variables que volem que es veguin en qualsevol procediment
	public static int [] nombres=new int[10];
	public static void main(String[] args) {
		
		Inicialitza();
		//visualitzar array
		Imprimir();
		//modificar valors
		nombres[3]=10;
		nombres[2]=5;
		//calcular mitjana
		
		double mitjana=0;
		
		mitjana=calculamitjana();
		
		visualitzamitja(mitjana);
		
		Imprimir();
	}
	public static void visualitzamitja(double mitjana) {
		System.out.println("La mitjana"+mitjana);
	}
	public static double calculamitjana() {
		double sumatori=0;
		for(int cont=0;cont<10;cont++) {
			sumatori=sumatori+nombres[cont];
		}
		return(sumatori/10);
	}
	public static void Inicialitza() {
		for(int cont=0;cont<10;cont++) {
			nombres[cont]=cont;
		}
		
	}
	public static void Imprimir() {
		for (int cont=0;cont<10;cont++) {
			System.out.println(nombres[cont]);
		}
	}

}
