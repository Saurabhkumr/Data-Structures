import java.util.ArrayList;

public class permutation {
  public static void main(String[] args) {
    // ArrayList<String> ans = string_permutation("", "abc");
    // System.out.println(ans);
    string_permutation("", "abc");

  }

  public static void string_permutation(String p, String up) {
    if (up.isEmpty()) {
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0);
    for (int i = 0; i <= p.length(); i++) {
      String f = p.substring(0, i);
      String s = p.substring(i, p.length());
      string_permutation(f + ch + s, up.substring(1));
    }
  }
  // public static ArrayList<String> string_permutation(String p, String up) {
  // if (up.isEmpty()) {
  // ArrayList<String> list = new ArrayList<>();
  // list.add(p);
  // return list;
  // }
  // char ch = up.charAt(0);
  // ArrayList<String> ans = new ArrayList<>();
  // for (int i = 0; i <= p.length(); i++) {
  // String f = p.substring(0, i);
  // String s = p.substring(i, p.length());
  // ans.addAll(string_permutation(f + ch + s, up.substring(1)));
  // }
  // return ans;
  // }
}
