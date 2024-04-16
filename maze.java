import java.lang.reflect.Array;
import java.util.ArrayList;

public class maze {
  public static void main(String[] args) {
    // mazePath("", 3, 3);
    // System.out.println(mazePathRet("", 3, 3));

    boolean[][] m = {
        { true, true, true },
        { true, false, true },
        { true, true, true }
    };
    mazeRestriction("", m, 0, 0);

  }

  public static void mazePath(String p, int r, int c) {
    if (r == 1 && c == 1) {
      System.out.println(p);
      return;
    }

    if (c > 1)
      mazePath(p + "R", r, c - 1);
    if (r > 1)
      mazePath(p + "D", r - 1, c);
  }

  public static ArrayList<String> mazePathRet(String p, int r, int c) {
    if (r == 1 && c == 1) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> ans = new ArrayList<>();

    if (c > 1)
      ans.addAll(mazePathRet(p + "R", r, c - 1));
    if (r > 1)
      ans.addAll(mazePathRet(p + "D", r - 1, c));

    return ans;
  }

  public static void mazeRestriction(String p, boolean[][] m, int r, int c) {
    if (r == m.length - 1 && c == m[0].length - 1) {
      System.out.println(p);
      return;
    }
    if (!m[r][c])
      return;

    if (c < m[0].length - 1)
      mazeRestriction(p + "R", m, r, c + 1);
    if (r < m.length - 1)
      mazeRestriction(p + "D", m, r + 1, c);

  }
}
