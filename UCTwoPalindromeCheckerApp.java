/*
 * @author Developer
 * @version 1.0
 */

import java.util.Scanner;

public class UCTwoPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		//Getting input string 
		System.out.println("Input text: ");
		String input=sc.nextLine();
		boolean result=true;

		//Loop only till half of the string length
		for(int i=0;i<input.length()/2;i++) {
			if(input.charAt(i)!=input.charAt(input.length()-1-i)) {
				result=false;
			}
		}
		if(result) {
			System.out.println("Is it a palindrome? : "+result);
		}
		else {
			System.out.println("Is it a palindrome? : "+result);
		}
	}
}
