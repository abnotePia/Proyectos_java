import java.util.Scanner;
public class calcular_radi {
	//Les constants es defineixen fora del main
	static final double PI=3.14159265;
	
	public static void main(String[] args) {
		double  rdoble,r,resultat;
		String demanarRadi, Resultat;
		demanarRadi= "Introduce el redio de la circunferencia: ";
		Resultat= "El area es: ";
		Scanner entrada = new Scanner(System.in);
		System.out.println(demanarRadi);
		r=entrada.nextDouble();
		rdoble=r*r; //Math.pow(r,2);
		resultat= PI*rdoble;
		System.out.println(Resultat+resultat);
	}

}