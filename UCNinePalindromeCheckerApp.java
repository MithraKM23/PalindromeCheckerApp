/*
 * @author Developer
 * @version 1
 */

import java.util.Scanner;

public class UCNinePalindromeCheckerApp {

	public static void main(String[] args) {
		//Getting input string
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String input=sc.nextLine();
		
		//Initialising the start and end index
		int start=0;
		int end=input.length()-1;
		
		//calling the isPalindrome function and storing the result
		boolean result=isPalindrome(input,start,end);
		if(result) {
			System.out.println("Is palindrome? "+result);
		}
		else {
			System.out.println("Is palindrome? "+result);
		}
	}
	
	//Recursive method to check the string is a palindrome or not
	public static boolean isPalindrome(String input,int start,int end) {
		if(start>=end) {
			return true;
		}
		if(input.charAt(start)!=input.charAt(end)) {
			return false;
		}
		return isPalindrome(input,start+1,end-1);
	}

}
