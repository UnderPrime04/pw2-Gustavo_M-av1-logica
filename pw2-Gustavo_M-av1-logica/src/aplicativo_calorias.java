import java.util.Scanner;

public class aplicativo_calorias {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
	
			System.out.println("refeicao: ");
			int X = ed.nextInt();
			

			int Q1 = 1500;
			int Q2 = 2000;		
			int Q3 = 2500;	
			int saldo;
			
			saldo = Q2 - Q1;
			
			if(saldo <= X)
			{
			 System.out.println("CALORIAS = " + Q2);
			}
			
			else if(saldo >= X)
			{
				System.out.println("CALORIAS = " + Q3);
			}
		
	}
}
