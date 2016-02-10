import java.util.Scanner;
public class Dieznumerosfor{
	public static void main(String args[]){
		Scanner fr= new Scanner(System.in);
			int num,promedio;
			int suma=0;
			//int x=1;
			
			for (int i=0;i<10 ; i++) {
				System.out.println("Ingrese un valor");
				num=fr.nextInt();
				suma=(suma+num);

				//x=x+1;
			}
		
		promedio=(suma/10);
		System.out.println("suma:"+suma);
		System.out.println("promedio:"+promedio);
		
		
	}
}