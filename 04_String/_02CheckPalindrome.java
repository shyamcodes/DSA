public class _02CheckPalindrome {

  public static boolean isPalindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      int n = str.length();
      if (str.charAt(i) != str.charAt(n - 1 - i)) {
        // not palindrome
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    // String str = "racecar";
    // String str = "madam";
    // String str = "noon";
    String str = "hello";
    System.out.println(isPalindrome(str));

  }

}
