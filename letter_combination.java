import java.util.ArrayList;
import java.util.List;

public class letter_combination {
  public static void main(String[] args) {
    System.out.println(letterCombinations(""));

  }

  public static List<String> letterCombinations(String digits) {
    if (digits.length() == 0) {
      return new ArrayList<>();
    }
    String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    String output = "";
    return phone(output, digits, mapping);

  }

  public static ArrayList<String> phone(String p, String up, String[] mapping) {
    if (up.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;

    }
    int digit = up.charAt(0) - '0';
    String str = mapping[digit];
    ArrayList<String> ans = new ArrayList<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      ans.addAll(phone(p + ch, up.substring(1), mapping));
    }
    return ans;
  }

  // public static ArrayList<String> phone(String p, String up) {
  // if (up.isEmpty()) {
  // ArrayList<String> list = new ArrayList<>();
  // list.add(p);
  // return list;
  // // System.out.println(p);
  // // return;
  // }
  // int digit = up.charAt(0) - '0';
  // ArrayList<String> ans = new ArrayList<>();

  // for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
  // char ch = (char) ('a' + i);
  // ans.addAll(phone(p + ch, up.substring(1)));
  // }
  // return ans;
  // }
}
