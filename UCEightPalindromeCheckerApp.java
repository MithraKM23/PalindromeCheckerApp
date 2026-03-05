/*
 * @author Developer
 * @version 1
 */

import java.util.LinkedList;
import java.util.Scanner;

public class UCEightPalindromeCheckerApp {
	public static void main(String[] args) {
		LinkedList<Character> linkedlist=new LinkedList<>();
		
		//Getting input string
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String input=sc.nextLine();
		
		//Storing the string as a character array
		char[] inputchar=input.toCharArray();
		for(char c:inputchar) {
			linkedlist.add(c);
		}
		boolean result=true;
		
		//Comparing the first and last elements in the linkedlist
		while(linkedlist.size()>1) {
			if(!linkedlist.removeFirst().equals(linkedlist.removeLast())) {
				result=false;
				break;
			}
		}
		
		//If result is trure print true else false
		if(result) {
			System.out.println("Is palindrome? "+result);
		}
		else {
			System.out.println("Is palindrome? "+result);
		}
	}
}
