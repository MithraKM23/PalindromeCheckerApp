/*
 * @author Developer
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Stack;

public class UCFivePalindromeCheckerApp {
	public static void main(String[] args) {
		
		//Getting input from the user
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String input=sc.nextLine();
		
		//Storing the string in a character array
		char[] chararray=input.toCharArray();
		Stack<Character> stack=new Stack<>();
		
		//pushing all the characters in the stack using for loop
		for(char c:chararray) {
			stack.push(c);
		}
		boolean result=true;
		
		//Comparing the character array and the popping characters
		for(char c:chararray) {
			if(c!=stack.pop()) {
				result=false;
				break;
			}
		}
		
		//print true if the string is palindrome else false
		if(result) {
			System.out.println("Is palindrome? "+result);
		}
		else {
			System.out.println("Is palindrome? "+result);

		}
	}

}
