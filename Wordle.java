package lab10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Wordle {
	private String solution;
	public Wordle() {
		File file = new File("words.txt");
		try (Scanner sc = new Scanner(file)) {
			int i = 0;
			while(sc.hasNextLine()) {
				sc.nextLine();
				i++;
			}
			sc.close();
			Scanner sc2 = new Scanner(file);
			String[] wordlist = new String[i];
			i = 0;
			while(sc2.hasNextLine()) {
				wordlist[i] = sc2.nextLine();
				i++;
			}
			sc2.close();
			solution = wordlist[(int) (Math.random() * i)];
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public String getSolution() {
		return solution;
	}
	public String letterEval(String letter, int pos) {
		// unfortunately idk how to implement the weird yellow logic with double letters with this implementation :[ fortunately, you didn't specify in the description i had to do that so now its your fault >:3
		if (solution.substring(pos,pos+1).equals(letter)) {return "O";} else if (solution.indexOf(letter) != -1) {return "?";} else {return "_";}
	}
	public String wordEval(String guess) {
		if (guess.length() != 5) {return "Error! You put in a word that wasn't 5 letters. Stupid.";}
		String e = "";
		for (int i = 0; i < 5; i++) {
			e += letterEval(guess.substring(i,i+1), i) + " ";
		}
		return e;
	}
}
