import java.util.Scanner;

public class _01Strings {

  public static void printLetters(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i) + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // char arr[] = { 'a', 'b', 'c', 'd' };
    // String str = "abcd";
    // String str2 = new String("xyz");

    // // Strings are IMMUTABLE in java.
    // Scanner sc = new Scanner(System.in);
    // String name;
    // // name = sc.next();
    // name = sc.nextLine();
    // System.out.println(name);

    // String fullName = "Rahul singh";
    // System.out.println(fullName.length());

    // Concatenation - do cheejo ko jodna.
    // String firstName = "Rahul";
    // String lastName = "Singh";
    // String fullName = firstName + " " + lastName;
    // System.out.println(fullName);
    // System.out.println(fullName.charAt(0));
    printLetters(fullName);
  }
}
