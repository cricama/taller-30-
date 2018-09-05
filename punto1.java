package punto;
import java.util.Scanner;
class punto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		
		int a;
		int cubo,cuadrado;
		
	      System.out.println("ingrese un numero: ");
	      
	      a=sc.nextInt();
	      
	  cuadrado = a * a;
	  cubo = a * a * a;
	  
	  System.out.println("este es el resultado al cuadrado: "+cuadrado);
	  System.out.println("este es el resultado al cubo: "+cubo);
	  
	}

}
