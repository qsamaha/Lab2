import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		String choice = "y";

		while (choice.equals("y")) {
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			System.out.println(" ");

			Scanner scan = new Scanner(System.in);

			System.out.println("Enter Length: ");
			double num = scan.nextDouble();
			System.out.println("Enter Width: ");
			double num2 = scan.nextDouble();
			double num3 = num * num2;
			double num4 = 2 * (num + num2);
			System.out.println("Area: " + num3);
			System.out.println("Perimeter: " + num4);

			System.out.println(" ");

			System.out.println("Continue? (y/n): ");
			scan.nextLine();
			choice = scan.nextLine();

		}
		System.out.println(" ");
		System.out.println("Thank you for using the Grand Circus Room Detail Generator!");
	}
}
