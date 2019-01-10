package main;
import java.util.*;

public class FrequencyTest {

	public static int frequency(String text, String word) {

		int c = 0;
		String[] words = text.split(" |\\.");
		for (int i = 0; i < words.length; i++) {
			if (word.equalsIgnoreCase(words[i]))
				++c;
		}
		return c;
	
	}

	public static void main(String a[]) {
		
		String textLine;
		String word;
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("1. Check ");
			System.out.println("2. Exit");
			System.out.println("Enter Your Choice : ");
			choice = sc.next();
			sc.nextLine();
			
			if (choice.equals("1")) {
				
				System.out.println("Enter Sentence : (** Kindly give a space before and after '.' for accurate results)");
				textLine = sc.nextLine();
				System.out.println("Enter the word whose frequency you wanna check - ");
				word = sc.nextLine();
				System.out.println("Count = " + frequency(textLine, word));
				System.out.println();
			
			} else if (!choice.matches("1|2")) {
				System.out.println("Invalid Choice !! Re-enter ");
			}
			
		} while (!choice.equals("2"));
		
		System.out.println("Exiting...");
		sc.close();
		System.exit(0);
	
	}

}
