/*
 * @author Developer
 * @version 1
 */

import java.util.Scanner;
public class UCTenPalindromeCheckerApp {

	public static void main(String[] args) {
		
		//Getting input string
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String input=sc.nextLine();
		char[] inputchar=input.toCharArray();
		StringBuilder sb=new StringBuilder();
		String s="";
		
		//Store the string without whitespaces in a new string
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!=' ') {
				s+=input.charAt(i);
			}
		}
		
		//Store the string in a stringBuilder and reverse that string.
		for(char c:inputchar) {
			if(Character.isLetter(c)) {
				sb.append(Character.toLowerCase(c));
			}	
		}
		String reversed=sb.reverse().toString();
		
		//Comparing the reversed string with the input string
		if(reversed.equalsIgnoreCase(s)) {
			System.out.println("Is palindrome? "+true);
		}
		else {
			System.out.println("Is palindrome? "+false);
		}

	}

}
