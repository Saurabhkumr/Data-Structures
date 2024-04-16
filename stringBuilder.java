public class stringBuilder {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("hello");
    StringBuilder str1 = new StringBuilder("hello");
    String s = new String("hello");
    String s2 = new String("hello");
    String s1 = "hello";

    System.out.println(s1.equals(s));
    System.out.println(s1.toString().equals(str.toString()));
  }
}
