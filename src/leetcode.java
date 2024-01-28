import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode {
    public static void main(String[] args) {
        // String str="qawertuioplkjhgfdszxcvbnm";
        // List<List<String>> str =
        // Arrays.asList(Arrays.asList("phone","blue","pixels"),
        // Arrays.asList("sd", "sasd", "Ads"),
        // Arrays.asList("asdx", "blue", "adx"));
        // // System.out.println(checkIfPangram(str));
        // // System.out.println(str.indexOf((char)1+96));

        // System.out.println(countMatches(str, "color","blue"));

        int[][] arr = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        System.out.println(flipAndInvertImage(arr));
        ;
        // System.out.println(largestAltitude(gain));
    }
    // public static boolean checkIfPangram(String sentence) {
    // if(sentence.length()<26) return false;
    // for(int i=1;i<=26;i++)
    // if(sentence.indexOf((char)i+96)<0)
    // return false;
    // return true;
    // }

    // public static int countMatches(List<List<String>> items, String ruleKey,
    // String ruleValue) {
    // int index;
    // int count=0;
    // switch(ruleKey){
    // case "type" :
    // index=0;
    // break;
    // case "color" :
    // index = 1;
    // break;
    // case "name" :
    // index=2;
    // break;
    // default:
    // index=-1;

    // }
    // for(int i=0;i<items.size();i++){
    // if(ruleValue.equals(items.get(i).get(index))){
    // count++;
    // }
    // }

    // return count;

    // }

    // public static int largestAltitude(int[] gain) {
    // int[] ans =new int[gain.length+1];
    // ans[0]=0;
    // for(int i =1;i<gain.length;i++){
    // ans[i]=gain[i-1]+ans[i-1];

    // }
    // int max = Arrays.stream(ans).max().getAsInt();
    // return max;

    // }

    static int[][] flipAndInvertImage(int[][] arr) {
        int size = arr.length;
        for(int i = 0; i< size;i++){
            for(int j = 0 ; j < arr[i].length;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                    int temp =arr[i][j];
                    arr[i][j]=arr[i][size-i-1];
                    arr[i][size-i-1]=temp;      
                  }
                else{
                    arr[i][j]=0;
                int temp =arr[i][j];
                    arr[i][j]=arr[i][size-i-1];
                    arr[i][size-i-1]=temp; 
                }

            }
       }
                   return arr;
    }


    
}
