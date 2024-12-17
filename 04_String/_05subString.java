public class _05subString {

  public static String subString(String str, int startIdx, int endIdx) {
    String subStr = "";
    for (int i = startIdx; i < endIdx; i++) {
      subStr += str.charAt(i);
    }
    return subStr;
  }

  public static void main(String[] args) {
    // SubString
    String str = "HelloWorld";
    System.out.println(subString(str, 0, 5));

    // subString method to find substing.
    System.out.println(str.substring(0, 5));

  }

}
