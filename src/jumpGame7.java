public class jumpGame7 {
  public static void main(String[] args) {
    String a = "xbdef";
    String b = "xecab";
    System.out.println(checkPalindromeFormation(a, b));
  }

  static boolean checkPalindromeFormation(String a, String b) {
    if (pallindrome(a) || pallindrome(b))
      return true;
    int i = 1;
    while (i < a.length()) {
      if (pallindrome(a.substring(0, i) + b.substring(i)) || pallindrome(b.substring(0, i) + a.substring(i)))
        return true;
      i++;
    }
    return false;

  }

  static boolean pallindrome(String str) {
    StringBuilder s = new StringBuilder(str);
    return str == s.reverse().toString();
  }
}