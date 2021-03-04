package metodes;

public class exemplesparametres {

	public static void main(String[] args) {
		
		exemplesparametres p=new exemplesparametres();
		p.principal();
		
	}
	public void principal () {
		//PAs per valor
		int x=6;
		int t=10;
		suma(x,t);
		System.out.println(x+" - "+t);
		//PAS PER REFERENCIA
		int [] valor=new int[5];
		valor[0]=1;
		valor[1]=2;
		valor[2]=3;
		valor[3]=4;
		valor[4]=5;
		suma2(valor);
		for (int i=0;i<5;i++) {
			System.out.println(valor[i]);
		}
	
	}
	public  void suma2(int [] valor) {
		valor[0]=7;
		valor[1]=88;
		valor[2]=99;
		for (int i=0;i<5;i++) {
			System.out.println(valor[i]);
		}
	}
	public  void suma(int x,int t) {
		x=22;
		t=33;
		System.out.println(x+" - "+t);
	}

}
