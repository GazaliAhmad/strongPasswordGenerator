import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.text.MessageFormat.format;

public class StrongPassword {
	public static void main(String[] args) {
      
      out.println("\nLength of password required (16 characters is best) ?");
      
      try (var input = new Scanner(in))
      {while (!input.hasNextInt()) {
          out.println("Please enter an integer");
          input.next();
        }
        var length = input.nextInt();
        out.println(format("\nAuto generated password: {0}\n", generatePassword(length)));
      } catch (Exception e) {
        out.println("Error: " + e.getMessage());
      }
  }

  @SuppressWarnings("ReassignedVariable")
  private static @NotNull StringBuilder generatePassword(int length) {
    final var password = new StringBuilder();
      while (length > 0) {
        password.append(Character.toString((int) (Math.random() * 94 + 33)));
        length--;
      }
      return password;
  }
}
