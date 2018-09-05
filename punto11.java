package punto11;
import java.util.Scanner;
import java.util.*;
class punto11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double A,B,C,D,P,L;
		System.out.println( "Digite El primer numero: \n");
		A=sc.nextInt();
		System.out.println( "Digite El primer numero: \n");
		B=sc.nextInt();
		System.out.println( "Digite El primer numero: \n");
		C=sc.nextInt();
		System.out.println( "Digite El primer numero: \n");
		D=sc.nextInt();
		P=A/B;
		L=C/D;
		System.out.println("resultado de p: \t "+P);
		System.out.println("resultado de l: \t "+L);
		
		if(B==0){
		System.out.println("indefinido: \t");
		}if(D==0){
			System.out.println("indefinido: \t");
		}
		
		if(P==L){
			System.out.println("son iguales\t");
		}else{ 
			System.out.println("no son iguales\t");
		}

	
	}

}
