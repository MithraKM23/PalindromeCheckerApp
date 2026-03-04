/*
 * @author Developer
 * @version 1.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UCSixPalindromeCheckerApp {
	public static void main(String[] args) {
		
		//Getting the input String
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String input=sc.nextLine();
		Stack<Character> stack=new Stack<>();
		Queue<Character> queue=new LinkedList<>();
		char[] inputchar=input.toCharArray();
		
		//Storing all the characters in the string in queue and stack
		for(char c:inputchar) {
			stack.push(c);
			queue.add(c);
		}
		boolean result=true;
		
		//Compare the characters in the queue and stack
		while(!queue.isEmpty()) {
			if(!queue.remove().equals(stack.pop())) {
				result=false;
				break;
			}
		}
		
		//If result is true print true else print false
		if(result) {
			System.out.println("Is palindrome? "+result);
		}
		else {
			System.out.println("Is palindrome? "+result);
		}
	}
}
