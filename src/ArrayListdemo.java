import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListdemo {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(0);
        for(int i =0; i<4;i++){
            list.add(i, sc.nextInt());
        }
        list.add(4, 5);
       
       System.out.println(list);
    }
}
