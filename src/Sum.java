import java.util.Scanner;

public class Sum{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, sum = 0;
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		System.out.print("\nEnter the second number: ");
		num2 = input.nextInt();
		sum = num1 + num2; 
		System.out.println( num1+ "+" + num2 + " = " + sum);
	}
}

		