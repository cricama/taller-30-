package punto2;
import java.util.Scanner;
class punto2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int a,s,d,l,p,j;
		System.out.println("ingrese numero1");
		 s=sc.nextInt();
			
		 System.out.println("ingrese numero2");
		 a=sc.nextInt();
		 
		 d= s+a;
		 p= s-a;
		 l= s*a;
		 j= s/a;
			
	System.out.println("el resultado de la suma es: "+d);
	System.out.println("el resultado de la resta es: "+p);
	System.out.println("el resultado de la multiplicasion es:"+l);
	System.out.println("el resultado de la division es: "+j);
		 
	}

}
