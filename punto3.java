package punto3;
import java.util.*;
import  java.util.Scanner ;
class punto {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double a,b,c,area,s;
		 
		 System.out.print("Introduce un número: ");
		 a =sc.nextFloat();
		 System.out.print("Introduce un número: ");
		 b =sc.nextFloat();
		 System.out.print("Introduce un número: ");
		 c =sc.nextFloat();
	
		 s = (a+b+c)/2;
		 
		 System.out.println(" Area" + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
		 
		 
		 

	}

}