package punto16;
import  java.util.Scanner;
import java.util.*;

class punto16 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int a,s,d = 0,l,t;
		 
		 System.out.println("ingrese el monto de que deve: ");
		  a = sc.nextInt();
		  
		  System.out.println("ingrese el monto a pagar: ");
		  s = sc.nextInt();
		  
		  
		  if(a==s) {
			  System.out.println("este fue tu ultimo pago: ");
			  
		  }if(a>s) {
			  
			  d=a-s;
			  
			  System.out.println("usted queda deviendo esto sin interes : "+d+" mil");
			  
		  }if(a>s) {
			  l= (int) (d*(.03));
			  
			  t=d+l;
			  
			  System.out.println("usted queda deviendo esto con  intereses : "+t+" mil");
			  
		  }if(a<s) {
			  System.out.println("error usted deve pagar lo que deve no mas :");
			  
		  }
		  

	}

}
