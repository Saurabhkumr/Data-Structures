// Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


// deFront("Hello") → "llo"
// deFront("java") → "va"
// deFront("away") → "aay"

public class que {
    public static void main(String[] args) {

        System.out.println(version("ba"));
        
    }
    static String version(String str){

        if(str.length()==0)
        return "no input";

        if(str.charAt(0)=='a' && str.charAt(1)=='b')
        return str;

        if(str.charAt(0)=='a' || str.charAt(1)=='b'){

         if(str.charAt(0)=='a')
         return 'a'+str.substring(2);

         else
          return 'b'+str.substring(2);

        }

          return str.substring(2);
        

    }
    
}
