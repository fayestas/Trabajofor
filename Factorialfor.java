import java.util.Scanner;
public class Factorialfor{
	public static void main(String args[]){
		Scanner fr= new Scanner(System.in);
			int num;
			int factorial=1;
			System.out.println("Ingrese un valor");
			num=fr.nextInt();
			
			
		for (int contador=1;contador<=num; contador++) {
			factorial=factorial*contador;
			System.out.println("factorial:"+factorial);
			
		}
		
		
		
		
	}
}