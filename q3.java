import java.util.Scanner;

public class q3{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter side A = ");
		int sideA = input.nextInt();
		
		System.out.println("Enter side B = ");
		int sideB = input.nextInt();
		
		int num = (sideA * sideA) + (sideB * sideB);
		double hypo = Math.sqrt(num);
		
		System.out.println("Hypotenuse = " + hypo);
	}
}