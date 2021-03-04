package Arrays_1_dimensio.Repas;
public class arrays73 {

	public static void main(String[] args) {
		int [] numeros;
		numeros=new int[101];
		System.out.println("La taula dels 100 primers numeros es: ");
		for (int cont=0;cont<=100;cont++) {
			cont++;
			numeros[cont]=cont*cont;
			System.out.println(cont+" * "+cont+" = "+numeros[cont]);
			cont--;
		}	
	}

}
