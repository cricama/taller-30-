package punto9;

import  java.util.Scanner ;
class punto9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double dia=0.0416667;
		int hora=0;
		int segundos=3600;
		int minutos=60;
		double total,camilo,dias;
		System.out.print("Introduce las horas : ");
		hora = sc.nextInt();
			
	total = hora*minutos;
	camilo= hora*segundos;
	dias = hora*dia;
	
	 System.out.println("este es el total : "+dias+" dias\n");
	 System.out.println("este es el total: "+total+" minutos\n");
	 System.out.println("este es el total : "+camilo+" segundos\n");
		
	}

}
