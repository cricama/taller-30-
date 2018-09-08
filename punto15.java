package punto15;
import java.util.*;
class punto {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,s,d;
		
		System.out.println("ingre un numero entero: ");
		a=sc.nextInt();
		
		System.out.println("ingre un numero entero: ");
		s=sc.nextInt();
		
		System.out.println("ingre un numero entero: ");
		d=sc.nextInt();
		
		

		if(a>s ){
		if(a>d){
			  System.out.println("El mayor es: " + a);
		}else{
			 System.out.println("El mayor es: " + d);
		}
		}else if(s>d){
			System.out.println("el mayor es: " + s);
		}else{
			 System.out.println("el mayor es: " + d);
		}
			
		
		if(a<s ){
			if(a<d){
				  System.out.println("El menor es: " + a);
			}else{
				 System.out.println("El menor es: " + d);
			}
			}else if(s<d){
				System.out.println("el menor es: " + s);
			}else{
				 System.out.println("el menor es: " + d);
			}
				
		
	}
}
