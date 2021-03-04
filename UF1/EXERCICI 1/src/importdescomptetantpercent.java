import java.util.Scanner;
public class importdescomptetantpercent {

	public static void main(String[] args) {
		float importe, descuento, importeNeto;
		String Importe, Descuento,ImporteNeto;
		Importe="Introduce el importe: ";
		Descuento="Introduce el descuento en tanto por ciento: ";
		ImporteNeto="El importe neto es: ";
		Scanner valor= new Scanner(System.in);
		System.out.println(Importe);
		importe= valor.nextFloat();
		System.out.println(Descuento);
		descuento= valor.nextFloat();
		importeNeto= importe-(importe*(descuento/100));
		System.out.println(ImporteNeto+importeNeto);
	}

}