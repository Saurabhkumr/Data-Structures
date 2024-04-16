import java.util.ArrayList;

public class diceCombination {
  public static void main(String[] args) {
    System.out.println(comboDice("", 4));
  }

  public static ArrayList<String> comboDice(String p, int up) {
    if (up == 0) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> ans = new ArrayList<>();
    for (int i = 1; i <= 6 && i <= up; i++) {
      ans.addAll(comboDice(p + i, up - i));
    }
    return ans;
  }
}
