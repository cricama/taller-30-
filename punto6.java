package punto;
import java.util.Scanner;
import java.util.*;
class punto {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float l1=0,l2=0,l3=0,l4=0,A=0, tot=0;
		int camilo=0;
		
		
		do{
		
				System.out.println( "Digite El lado 1 del cuadrado: ");
				l1=sc.nextFloat();
				tot = l1/2;
			
		}while(tot == 1); 		
		try{
			System.out.println( "Digite El lado 2 del cuadrado: ");
			l2=sc.nextFloat();
		}catch(Exception e){System.out.println("No es valido, solo numeros"); camilo=1; sc.nextLine();}
		try{
			System.out.println( "Digite El lado 3 del cuadrado: ");
			l3=sc.nextFloat();
		}catch(Exception e){System.out.println("No es valido, solo numeros"); camilo=1; sc.nextLine();}
		try{
			System.out.println( "Digite El lado 4 del cuadrado: ");
			l4=sc.nextFloat();
		}catch(Exception e){System.out.println("No es valido, solo numeros"); camilo=1; sc.nextLine();}


		if(l1 == l2){
			if(l1 == l3){
				if(l1==l4){
					A = l1*l2;
					System.out.println("El area del cuadrado es: "+ A);
				}else{
			 		System.out.println("No Es un cuadrado, Porque sus lados no son iguales.");
				}
			}else{
				
				System.out.println("No Es un cuadrado, Porque sus lados no son iguales.");
			}
		}else{
			System.out.println("No Es un cuadrado, Porque sus lados no son iguales.");
		}
		
	}
}
