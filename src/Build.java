import java.util.Arrays;

public class Build {
    public static void main(String[] args) {
        // StringBuilder a = new StringBuilder();
    // for(int i = 0 ; i<26 ; i++){
    //     char ch = (char)('a'+i);
    //     a.append(ch);
    // }
    // System.out.println(a.toString());
    // a.deleteCharAt(0);
    // System.out.println(a);
    // String name = "Saurabh Kumar";
    // System.out.println(Arrays.toString(name.toCharArray()));
    // ;
    // System.out.println(name.toLowerCase());
      
String name ="";
System.out.println(palindrome(name));

     
    }

    static boolean palindrome(String name){
        name =name.toLowerCase();
        int start = 0;
        int end = name.length()-1;
        while(start<end){
            if(name.charAt(start)==name.charAt(end)){
                start++;
                end--;
            }
            else
            return false;
        }
        return true;

    }


}

