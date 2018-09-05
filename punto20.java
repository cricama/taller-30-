package punto3;
import java.util.Scanner;
class punto3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero,i,j;
		
        System.out.print("cual tabla quiere que le salga: ");
        numero = sc.nextInt();
        
        for(i = 0; i<=numero; i++)
        {
            for(j = 1; j <= 10; j++)
            {
            	
                System.out.println(i + " X " + j + " = " + i*j);
            }
           
	
  }
		

	}

}
