package lab2;

import java.util.Scanner;

public class paragraphanalyzer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input:");
	    String paragraph = input.nextLine();
	    int wordcount = 1;
	    int lengthchecker = 0;
	    String longest = "";
	    String shortest = "verylongplaceholderwordthisisntagoodwaytogoaboutthisbutidontcare";
	    String currentword = "";
	    int thecounter = 0;
	    for (int i = 0; i < paragraph.length(); i++) {
	    	char c = paragraph.charAt(i);
	    	if (c == ((char) 32)) {
	    		wordcount++;
	    		if (lengthchecker < shortest.length()) {
	    			shortest = currentword;
	    		}
	    		lengthchecker = 0;
	    		if (currentword.equals("the")) {
	    			thecounter += 1;
	    		}
	    		currentword = "";
	    	} else {
	    		lengthchecker++;
	    		currentword += c;
	    		if (lengthchecker > longest.length()) {
	    			longest = currentword;
	    		}
	    	}
	    }
	    System.out.println("Number of Words: " + wordcount);
	    System.out.println("Longest Word: " + longest);
	    System.out.println("Shortest Word: " + shortest);
	    System.out.println("Amount of \"The\"s: " + thecounter);
	}
}
