/*
 * @author Developer
 * @version 1
 */

import java.util.Scanner;
import java.util.Stack;

public class StackStrategy implements PalindromeStrategy{
	public void stackImplementation() {
		//Getting input from the user
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String input=sc.nextLine();
		boolean result=isPalindrome(input);
		//print true if the string is palindrome else false
		if(result) {
			System.out.println("Is palindrome? "+result);
		}
		else {
			System.out.println("Is palindrome? "+result);

		}
	}
	public boolean isPalindrome(String input) {

		//Storing the string in a character array
		char[] chararray=input.toCharArray();
		Stack<Character> stack=new Stack<>();

		//pushing all the characters in the stack using for loop
		for(char c:chararray) {
			stack.push(c);
		}


		//Comparing the character array and the popping characters
		for(char c:chararray) {
			if(c!=stack.pop()) {
				return false;
			}
		}
		return true;

	}

}
