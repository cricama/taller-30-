package punto24;
import  java.util.Scanner;
import java.util.*;
class punto24 {

	public static void main(String[] args) {
		int a=0,p=0,d=0,f=0,r=0,ano=103680;
		 Scanner sc = new Scanner(System.in);
		
	
		p=(int) (24.000*131400*12);
		
		d=(144*360);
		f=p/d;
		r=d+f;
		
		 System.out.println("1: "+p+" plata");
		 System.out.println("2: "+f+" intereses");
		 System.out.println("3: "+r+" dolares");
	}

}
