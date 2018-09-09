package punto26;
import  java.util.Scanner;
import java.util.*;
class punto26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rapido = 0,lento = 0,p=0;
		
		
		System.out.println("hola ingre el valor de la la rapides para mirar si anda rapido o lento: ");
		p=sc.nextInt();
		
		
			
		if(p<=90) {
			
			
			System.out.println("usted va bin "+p+"KM/H");
			
		}else{
	
			System.out.println("usted va rapido "+p+"KM/H");
			
		}if(p>=160) {
	
		
			System.out.println("fin ");
		
		}
		
	
	}
}

