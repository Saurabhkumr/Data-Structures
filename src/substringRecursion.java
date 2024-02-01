public class substringRecursion {
    public static void main(String[] args) {
        
       subString("baccdah", "");
       System.out.println(sub("bbaccad"));
    }
    static void subString(String str , String upstr){
        if(str.isEmpty()){
            System.out.println(upstr);
            return;
        }
        if(str.charAt(0)=='a'){
            subString(str.substring(1), upstr);;
        }
        else{
           subString(str.substring(1), upstr+str.charAt(0));
        }
          
       
    }
    static String sub(String str){
        if(str.isEmpty()){
           return "";
        }
        if(str.charAt(0)=='a'){
            return sub(str.substring(1));
        }
        else{
           return str.charAt(0)+sub(str.substring(1));
        }
          
       
    }
}
