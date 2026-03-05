/*
 * @author Developer
 * @version 1
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeStrategy {
	public void dequeImplementation() {
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
		//Creating a deque
		Deque<Character> deque=new ArrayDeque<>();

		//Storing the characters in deque
		char[] inputchar=input.toCharArray();
		for(char c:inputchar) {
			deque.addLast(c);
		}

		//Compare the first and last elements of deque
		while(deque.size()>1) {
			if(!deque.removeFirst().equals(deque.removeLast())) {
				return false;
			}
		}
		return true;
	}
}
