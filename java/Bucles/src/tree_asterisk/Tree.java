package tree_asterisk;

import java.util.Scanner;

public class Tree {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	int finalTree = 0;
	String tree = "*";
	
	System.out.println("Hello! Let's make a great asterisk tree!");
	System.out.println("Tell me an integer number to decide how tall the tree should be:");
	
	try {
		int size = input.nextInt();
		
		// while
		while (finalTree !=size) {
			System.out.println(tree);
			tree = tree+"*";
			finalTree++;
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println(tree);
			tree = tree+"*";
		}
		
		
	} catch (Exception e) {
		System.err.print("Incorrect input. Please enter a valid number.");
	}
	
	
		
		
	}

}
