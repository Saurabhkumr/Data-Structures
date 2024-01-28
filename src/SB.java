public class SB {
    public static void main(String[] args) {
    //    float a = 456.12345f;
    //    System.out.printf("Formatted number is %.2f",a);
     
    //    System.out.println('a'+'b');
    //    System.out.println("a"+"b");

    StringBuilder a = new StringBuilder();
    for(int i = 0 ; i<26 ; i++){
        char ch = (char)('a'+i);
        a.append(ch);
    }
    System.out.println(a.toString());

    }
}
