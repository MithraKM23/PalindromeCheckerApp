/*
 * @author Developer
 * @version 1
 */

import java.util.Scanner;

public class UCElevenPalindromeCheckerApp {

	public static void main(String[] args) {
		//Getting input string
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String input=sc.nextLine();
		
		//Creating  a object to call the method that is in another class
		PalindromeService palindrome=new PalindromeService();
		System.out.println("Is palindrome? "+palindrome.isPalindrome(input));
	}

}
