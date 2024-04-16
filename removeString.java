public class removeString {

    // public static String removeChar(String word, char ch) {
    //     StringBuilder sb = new StringBuilder(word);
    //     for (int i = 0; i < sb.length(); i++) {
    
    //         if (sb.charAt(i)=='a') {
    //             sb.deleteCharAt(i);
    //             i--;
    //         }
    //     }
    //     return sb.toString();
    // }

    public static void main(String[] args) {
        String str = "bbaccadd";
        System.out.println(remove(str));
        remove2("",str);
        // System.out.println(removeChar(word, ch));
    }

    static String remove(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.charAt(0)=='a'){
            return remove(str.substring(1));

        }
        else{
            return str.charAt(0)+remove(str.substring(1));
        }

    }

    static void remove2(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char x = up.charAt(0);
        if(x == 'a'){
            remove2(p,up.substring(1));
        }else{
            remove2(p+x,up.substring(1));
        }
    }
}
