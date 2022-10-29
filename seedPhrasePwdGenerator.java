import java.util.Scanner;
import static java.lang.Math.random;
import static java.lang.System.*;
import static java.text.MessageFormat.format;

@SuppressWarnings("ALL")
public class seedPhrasePwdGenerator {
	public static void main(String[] args) {
		
		var input = new Scanner(in);
		out.println("\nEnter seed phrase to generate a password: ");
		var seedPhrase = input.nextLine();
		
		while (seedPhrase.length() < 8) {
			err.println("\nSeed Phrase must be more than 8 characters");
			err.println("\nRe-enter seed phrase to generate a password: ");
			seedPhrase = input.nextLine();
		}
		input.close();
		
		// randomize the seed seedPhrase
		StringBuilder password = new StringBuilder();
		while (seedPhrase.length() > 0) {
			var index = (int)(random() * seedPhrase.length());
			password.append(seedPhrase.charAt(index));
			seedPhrase = format("{0}{1}", seedPhrase.substring(0, index), seedPhrase.substring(index + 1));
		}
		
		// Replace vowels with random numbers
		for (var i = 0; i < password.length(); i++) {
			var c = password.substring(i, i + 1);
			if ("aeiou".contains(c)) {
				password = new StringBuilder(format("{0}{1}{2}", password.substring(0, i), (int) (random() * 10), password.substring(i + 1)));
			}
		}
		
		// Alternate upper and lower case
		for (var i = 0; i < password.length(); i += 2) {
			password = new StringBuilder(password.substring(0, i) +
					password.substring(i, i + 1).toUpperCase() +
					password.substring(i + 1));
		}
		
		// Replace all spaces with new random special characters
		var specialChars = "~!@#$%^&*()_+-={}|[]\\:\"<>?,./";
		while (password.toString().contains(" ")) {
			var index = password.indexOf(" ");
			password = new StringBuilder(format("{0}{1}{2}", password.substring(0, index),
					specialChars.charAt((int) (random() * specialChars.length())), password.substring(index + 1)));
		}
		// prepend random special characters
		var index = (int)(random() * specialChars.length());
		password = new StringBuilder(format("{0}{1}", specialChars.substring(index, index + 1), password.toString()));
		
		// append random special characters
		index = (int)(random() * specialChars.length());
		password = new StringBuilder(format("{0}{1}", password.toString(), specialChars.substring(index, index + 1)));
		
		out.println(format("Your password is: {0}", password.toString()));
	}
}
