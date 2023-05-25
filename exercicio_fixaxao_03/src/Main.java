import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		double A, area;
		double pi = 3.14159;
		
		A = sc.nextDouble();
		area = pi * A * A;
		
		System.out.printf("A = %4f%n", area);
		
		sc.close();
	}

}
