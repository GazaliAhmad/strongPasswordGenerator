import static java.lang.System.out;
import static java.text.MessageFormat.format;

public class StrongPassword {
	public static void main(String[] args) {
    
    out.println(format("\nAuto generated password: {0}\n", generatePassword(16)));
  }

  private static StringBuilder generatePassword(int length) {
    final var password = new StringBuilder();
      while (length > 0) {
        password.append(Character.toString((int) (Math.random() * 94 + 33)));
        length--;
      }
      return password;
  }
}

// User input
  /*
    import java.util.Scanner;
    import static java.lang.System.in;

    out.println("\nLength of password required (16 characters is best) ?");
		
    try (var input = new Scanner(in)) {
      while (!input.hasNextInt()) {
        out.println("Please enter an integer");
        input.next();
      }
      
      var length = input.nextInt();
      out.println(format("\nAuto generated password: {0}\n", generatePassword(length)));
    
    }
  */