/*
 * @author Developer
 * @version 1.0
 */

import java.util.Scanner;

public class UCThreePalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Original: ");
		String original=sc.nextLine();
		StringBuilder sb=new StringBuilder(original);
		String reversed=sb.reverse().toString();
		System.out.println("Reversed: "+reversed);
		boolean result=true;
		if(original.equals(reversed)) {
			System.out.println("Is Palindrome? "+result);
		}
		else {
			result=false;
			System.out.println("Is Palindrome? "+result);
		}
	}
}
