/*
 * @author Developer
 * @version 1
 */

import java.util.Scanner;

public class UCTwelvePalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("1. stack Implementation\n2. Deque Implementation\nEnter your choice: ");
		int choice=sc.nextInt();
		if(choice==1) {
			StackStrategy stackstrategy=new StackStrategy();
			stackstrategy.stackImplementation();
		}
		else if(choice==2) {
			DequeStrategy dequestrategy=new DequeStrategy();
			dequestrategy.dequeImplementation();
		}
	}
}
