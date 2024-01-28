public class max {
    public static void main(String[] args) {
        // System.out.println(max1020(10 , 19));
        everyNth("Miracle", 2);
        
    }

    static int max1020(int a , int b){
        int max = (a>b) ? a:b ;
        if(max>=10 && max<=20){
            return max;
        }
        else if (a>=10 && a<=20){
            return a;
        }
        else if (b>=10 && b<=20){
            return b;
        }
        return 0;
    }

    static void everyNth(String str , int a){
        for(int i = 0 ; i<str.length();i=i+a){
        System.out.print(str.charAt(i));
        }
    }
}
