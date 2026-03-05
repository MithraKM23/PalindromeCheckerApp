/*
 * @author Developer
 * @version 1
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class UCThirteenPalindromeCheckerApp {
	public static void main(String[] args) {
		//Getting the input String
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String input=sc.nextLine();
		boolean keeprunning=true;
		
		//Running the while loop till the user exits
		while(keeprunning) {
		System.out.println("1. Stack Implementation\n2. Deque Implementation\n3. Two pointer Approach\n4. String Reverse\n5. Exit");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			stackPalindrome(input);
			break;
		case 2:
			dequePalindrome(input);
			break;
		case 3:
			twoPointer(input);
			break;
		case 4:
			stringReverse(input);
			break;
		case 5:
			keeprunning=false;
		default:
			break;
		}
		}
	}
	
	//Implementation using stack
	public static void stackPalindrome(String input) {
		//Storing the string in a character array
		char[] chararray=input.toCharArray();
		Stack<Character> stack=new Stack<>();

		//pushing all the characters in the stack using for loop
		for(char c:chararray) {
			stack.push(c);
		}
		boolean result=true;

		//Comparing the character array and the popping characters
		for(char c:chararray) {
			if(c!=stack.pop()) {
				result=false;
				break;
			}
		}

		//print true if the string is palindrome else false
		if(result) {
			System.out.println("Is palindrome? "+result);
			System.out.println("Execution time: "+System.nanoTime());
		}
		else {
			System.out.println("Is palindrome? "+result);
			System.out.println("Execution time: "+System.nanoTime());

		}
	}
	
	//Implementation using Deque
	public static void dequePalindrome(String input) {
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
			System.out.println("Execution time: "+System.nanoTime());
		}
		else {
			System.out.println("Is palindrome? "+result);
			System.out.println("Execution time: "+System.nanoTime());
		}
	}
	
	//Implementation using Two pointer
	public static void twoPointer(String input) {
		//Converting into character Array
		char[] inputchar=input.toCharArray();

		//Initializing the start and end index
		int start=0;
		int end=inputchar.length-1;
		boolean result=true;
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
			System.out.println("Execution time: "+System.nanoTime());
		}
		else {
			System.out.println("Is Palindrome? "+result);
			System.out.println("Execution time: "+System.nanoTime());
		}
	}
	
	//implementation using String reverse
	public static void stringReverse(String input) {
		StringBuilder sb=new StringBuilder(input);

		//Using String Builder to reverse the string and storing as a String
		String reversed=sb.reverse().toString();
		System.out.println("Reversed: "+reversed);
		boolean result=true;

		//if the reversed and original string are same print true
		if(input.equals(reversed)) {
			System.out.println("Is Palindrome? "+result);
			System.out.println("Execution time: "+System.nanoTime());
		}
		else {
			result=false;
			System.out.println("Is Palindrome? "+result);
			System.out.println("Execution time: "+System.nanoTime());
		}
	}
}
