// 9. Write a program to sum of user input until users input ‘q’ from keyboard.
package problemsolving;
import java.util.Scanner;
public class inputlimit {

	public static void main(String[] args) {
		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		try
		{
			while (true) {
		
			num = sc.nextInt();
			sum += num;
		}
		}
		catch (Exception e) {
			System.out.println("terminated");
		}
		System.out.println("Summation of all given input: " + sum);


	}

}
