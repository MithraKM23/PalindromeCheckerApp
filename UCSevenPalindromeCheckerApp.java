/*
 * @author Developer
 * @version 1
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UCSevenPalindromeCheckerApp {
	public static void main(String[] args) {
		//Getting the input String
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String input=sc.nextLine();
		
		//Creating a deque
		Deque<Character> deque=new ArrayDeque<>();
		
		//Storing the characters in deque
		char[] inputchar=input.toCharArray();
		for(char c:inputchar) {
			deque.addLast(c);
		}
		boolean result=true;
		
		//Compare the first and last elements of deque
		while(deque.size()>1) {
			if(!deque.removeFirst().equals(deque.removeLast())) {
				result=false;
				break;
			}
		}
		if(result) {
			System.out.println("Is palindrome? "+result);
		}
		else {
			System.out.println("Is palindrome? "+result);
		}
	}
}
