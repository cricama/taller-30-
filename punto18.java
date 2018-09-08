package punto;
import java.util.Scanner;
import java.util.*;
class punto {
static   String  nombre;
static int horas,p,extras;
static int sueldo,t,l,a,b,z;

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("ingres tu monbre: ");
		 nombre=sc.next();
		 System.out.println("hola: "+nombre);
		 System.out.println("en este campo solo puedes poner un rango de 1 a 40 horas si trabajo mas las pone en el otro campo: ");
		 horas=sc.nextInt();
		 System.out.println("ingrese cuantas horas extras trabajo: ");
		 z=sc.nextInt();
		 System.out.println("ingrese cuanto te pagan por una hora: ");
		 sueldo=sc.nextInt();
		 
		 if(horas<40) {
			t=sueldo*horas;
			 System.out.println("tu suledo "+nombre+" es de: "+t);
			 
		 }if(horas>39) {
		p= (int) (40*sueldo+z*sueldo*1.5);
			 
			 System.out.println("tu suledo "+nombre+" con extras de: "+p);
			 
		 }
		
	}

}