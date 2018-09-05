package punto2;

import  java.util.Scanner ;
class punto {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int r,a,b,c,d;
		 
		 System.out.println("ingrese un numero: ");
		 a = sc.nextInt();
			 System.out.println("ingrese un numero: ");
		      d= sc.nextInt();
				 System.out.println("ingrese un numero: ");
				  c = sc.nextInt();
					 System.out.println("ingrese un numero: ");
					  b = sc.nextInt();
					  
					r = ((a+d)/c)*b;
				
					  
					  System.out.println("este es el resultafo: "+r);
					 
		 

	}

}
