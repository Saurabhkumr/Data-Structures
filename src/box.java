public class box {
    public static void main(String[] args) {
        System.out.println(hasbox("xbad"));
        
        
    }
    static boolean hasbox(String str){
    
        if(str.length()<3)
        return false;

        if(str.substring(0, 3).equals("bad")){
            return true;
        }

        if(str.length()>3){

        if(str.substring(1,4).equals("bad")){
            return true;
        }

        }
        
        return false;

    }
}
