package qaautomation.march2022.javatask;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) throws Exception {

		try {
			Scanner angka = new Scanner(System.in);
			System.out.println("Enter number");

			int number1 = angka.nextInt();
			int number2 = angka.nextInt();
			
			int a = number1 + number2;
		    int b = number1 - number2;
		    int c = number1 / number2;
		    int d = number1 * number2;
		    
		    System.out.println(number1 + " + " + number2 + " = " + a);
		    System.out.println(number1 + " - " + number2 + " = " + b);
		    System.out.println(number1 + " / " + number2 + " = " + c);
		    System.out.println(number1 + " * " + number2 + " = " + d);
		    
		} catch (Exception e) {
			System.out.println("Input Number Only!");
		}
		
	 }

}
