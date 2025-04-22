public class recursion {
  public static void main(String[] args) {
    skipChar("", "bcadfaesaaa");
    System.out.println(skipChar2("bcadfaesaaa"));
  }

  public static void skipChar(String ans, String str) {
    if (str.isEmpty()) {
      System.out.println(ans);
      return;
    }
    if (str.charAt(0) != 'a')
      skipChar(ans + str.charAt(0), str.substring(1));
    else
      skipChar(ans, str.substring(1));
  }

  public static String skipChar2(String str) {
    if (str.isEmpty()) {
      return "";
    }
    if (str.charAt(0) != 'a')
      return str.charAt(0) + skipChar2(str.substring(1));
    else
      return skipChar2(str.substring(1));
  }

}
