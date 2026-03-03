/*
 * @author Developer
 * @version 1.0
 */

import java.util.Scanner;

public class UCFourPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Getting String input
		System.out.print("Input text: ");
		String input=sc.nextLine();
		boolean result=true;
		
		//Converting into character Array
		char[] inputchar=input.toCharArray();
		
		//Initializing the start and end index
		int start=0;
		int end=inputchar.length-1;
		while(start<end) {
			
			//If starting index is not equal to end index change result to false
			if(inputchar[start]!=inputchar[end]) {
				result=false;
				break;
			}
			else {
				start++;
				end--;
			}
		}
		
		if(result) {
			System.out.println("Is Palindrome? "+result);
		}
		else {
			System.out.println("Is Palindrome? "+result);
		}
	}
}
