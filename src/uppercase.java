public class uppercase {
    public static void main(String[] args) {
        String s = "asdDDfgWmnQMNHJK";
        System.out.println(upper(s, 0));
        
    }

    static char upper(String s , int i){
        
        if(Character.isUpperCase(s.charAt(i))){
            return s.charAt(i);
        }
        else
        return upper(s, i+1);
    }
}
