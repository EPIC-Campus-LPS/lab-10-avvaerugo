package lab10;

import java.util.Scanner;

public class WordleRunner {
	public static void main(String[] args) {
		Wordle w = new Wordle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Wordle Dordle Doo\nGreens are denoted with O\nYellows are denoted with ?\nGrays are denoted with _\n");
		
		int guessnum = 0;
		boolean run = true;
		while (guessnum < 6 && run) {
			guessnum += 1;
			System.out.println("Guess " + guessnum);
			String guess = sc.next();
			if (guess.equals(w.getSolution())) {run = false;}
			System.out.println(w.wordEval(guess));
		}
		if (!run) {System.out.println("You got it in " + guessnum + " guesses");} else {System.out.println("The answer was " + w.getSolution());}
		
		sc.close();
	}
}
