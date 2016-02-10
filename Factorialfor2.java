import java.util.Scanner;
public class Factorialfor2{
	public static void main(String args[]){
		Scanner fr= new Scanner(System.in);
			

			int factorial=1;
			

			for (int i=1; i<=10; i++) {
				factorial=(factorial*i);
				System.out.print(factorial +" " +"x"+" ");
				
			}
		
			
			
		
		
		System.out.println("factorial:"+factorial);
		
		
		
	}
}