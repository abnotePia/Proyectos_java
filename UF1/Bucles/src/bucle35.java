
public class bucle35 {

	public static void main(String[] args) {
		int contador=1;
		System.out.println("Bucle for");
		for (int cont=1;cont<=20;cont++) {
			System.out.println(cont);
		}
		contador=1;
		System.out.println("Bucle while");
		while (contador<=20) {
			System.out.println(contador);
			
			contador=contador+1;
		}
		contador=1;
		System.out.println("Bucle do while");
		do {
			System.out.println(contador);
			contador=contador+1;
		} while(contador<=20);
		
	}

}
