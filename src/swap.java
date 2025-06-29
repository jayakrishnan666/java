import java.util.Scanner;

public class swap {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, temp;
        System.out.print("Entert the number 1: ");
        num1 = sc.nextInt();
        System.out.print("\nEnter the Number 2: ");
        num2 = sc.nextInt();
        System.out.println("Before Swap");
        System.out.println("Number 1 =" +num1+ "\nNumber 2= " + num2);
        System.out.println("After Swap");
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Number 1= " +num1 + "\nNumber 2= " +num2);
    }
}