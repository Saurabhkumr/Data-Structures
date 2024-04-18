public class jumpGame4 {
  public static void main(String[] args) {
    String s = "011010";
    int minJump = 2;
    int maxJump = 3;
    System.out.println(canReach(s, minJump, maxJump));
  }

  static boolean canReach(String s, int minJump, int maxJump) {
    int i = 0;
    int j = 0;

    while (j < s.length()) {
      j = i + minJump;
      if (j < s.length() && s.charAt(j) != '0')
        j = i + maxJump;
      if ((i + minJump) <= j && j <= Math.min(i + maxJump, s.length() - 1))
        i = j;
      else
        return false;

    }
    return true;

  }
}
