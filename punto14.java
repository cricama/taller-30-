package punto14;
import java.util.*;
class punto14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
      int a,p;
      System.out.println("ingrese un mumero mayor de 100 o menor de 100 o igual a 100: ");
      a=sc.nextInt();
      
      if(a>100){
    	  p= a+100;
    	  System.out.println("si se cumple este caso pasa esto: "+p);
      }if(a ==100){
    	  p=a+1;
    	  System.out.println("si se cumple pasa esto: "+p);
      }if(a < 100){
    	  p=a-20;
    	  System.out.println("si se cumple pasa esto: "+p);
      }
		
		
	}

}
