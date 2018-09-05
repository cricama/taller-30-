package punto;
import java.util.Random;
import java.util.Scanner;
class punto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

	int a,b,c,d,x,cat;
	int aux;
	
	System.out.println("ingrese  valor de x: ");
	x=sc.nextInt();
	
	
	System.out.println("ingrese un numero");
	 a=sc.nextInt();
	
	 System.out.println("ingrese un numero");
	 b=sc.nextInt();
	 
	 System.out.println("ingrese un numero");
	 c=sc.nextInt();
		
	 System.out.println("ingrese un numero");
	 d=sc.nextInt();
	 
	 if( x > 0) {
		 
		 cat = (a+b)*(c+d);
		 System.out.println("resultado: "+cat);
	 }
	 if(x==0) {
		 cat = (a+b)/(c+d);
		 System.out.println("resultado: "+cat);
	 }
	 if(x<0) {
		 cat = a+b-c+d;
		 
		 System.out.println("resultado: "+cat);
	 }
	 
 }
		
 }
		