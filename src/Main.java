import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		char c;
		String s;
		double d;
		String s1;
		String s2;
		
		System.out.println("---Data input---");
		System.out.print("Character: ");
		c = input.next().charAt(0);
		System.out.print("String: ");
		s = input.next();
		System.out.print("Double: ");
		d = input.nextDouble();
		// A extra nextLine() is necessary to consume the pending newline
		input.nextLine();
		System.out.print("String s1: ");
		s1 = input.nextLine();
		System.out.print("String s2: ");
		s2 = input.nextLine();
		
		System.out.println();
		System.out.println("---Data output---");
		System.out.println("Character typed: " + c);
		System.out.println("String typed: " + s);
		System.out.println("Double typed: " + d);
		System.out.println("String s1 typed: " + s1);
		System.out.println("String s2 typed: " + s2);
		
		input.close();

	}
	
}
