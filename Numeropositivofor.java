import java.util.Scanner;
public class Numeropositivofor{
	public static void main(String args[]){
		Scanner fr= new Scanner(System.in);
			System.out.println("Ingrese Numero");
			


			int num=fr.nextInt();
			System.out.println("-------------------");
				if(num<1){
			System.out.println("Error");
			Numeropositivofor.main(null);
		}

			for (int i=1; i<=num; i++) {
		System.out.print(i);

			

				
				
			}
		
	}
}
