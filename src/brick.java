public class brick {
    public static void main(String[] args) {
        System.out.println(makeBrick(3, 1, 6));
        
    }
    static boolean makeBrick(int small, int big, int goal ){
        if(goal>big*5+small) return false;

        if(goal%5>small) return false;

        return true;

    }
}
