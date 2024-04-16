import java.util.ArrayList;
import java.util.Arrays;

public class subsets {
    public static void main(String[] args) {
        String str = "abc";
        stringSubset("", str);
        ArrayList<String> ans = new ArrayList<>();
        stringSubsetArrayList("", str, ans);
        System.out.println(ans);
        
    }
    static void stringSubset(String sub , String str){
        if(str.isEmpty()){
            System.out.println(sub);
            return;
        }
        char ch = str.charAt(0);
        stringSubset(sub+ch, str.substring(1));
        stringSubset(sub, str.substring(1));
    }

    static void stringSubsetArrayList(String sub , String str , ArrayList<String> ans){
    
        if(str.isEmpty()){
            ans.add(sub);
            return;
        }
        char ch = str.charAt(0);
        stringSubsetArrayList(sub+ch, str.substring(1),ans);
        stringSubsetArrayList(sub, str.substring(1),ans);
       
    }
    static void stringSubset(String sub , String str , ArrayList<String> ans){
    
        if(str.isEmpty()){
            ans.add(sub);
            return;
        }
        char ch = str.charAt(0);
        stringSubsetArrayList(sub+ch, str.substring(1),ans);
        stringSubsetArrayList(sub, str.substring(1),ans);
       
    }
}
