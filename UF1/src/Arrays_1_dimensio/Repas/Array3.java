package Arrays_1_dimensio.Repas;

public class Array3 {

	public static void main(String[] args) {
		int [] numeros;
		numeros=new int[100];
		System.out.println("Els quadrats dels 100 primers numeros son: ");
		for (int cont=0;cont<100;cont++) {
			numeros[cont]=cont*cont;
			System.out.println(cont+" * "+cont+" = "+numeros[cont]);
		}
	}

}
