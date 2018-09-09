package punto21;
import javax.swing.JLabel; 

import  java.util.Scanner;
import java.util.*;

class punto21 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		int a,s = 0,d,f,p,i;
		System.out.println("ingrese un numero para mirar sies par o impar: ");
		a=sc.nextInt();
	
		s=a-2;
		d=s-2;
		f=d-2;
		p=f-2;
		
		if (a%2==0) {
			
			System.out.println(" par:"+s);
			System.out.println(" par :"+d);
			System.out.println(" par:"+f);
			System.out.println(" par:"+p);
		}else {
			
			System.out.println("impar:"+s);
			System.out.println("impar :"+d);
			System.out.println("impar:"+f);
			System.out.println("impar:"+p);
	
		}
	
		}
	
}

