public class reachNum {
    public static void main(String[] args) {
        int target = 2;
        int count =1;
        int pos=1;
        while(pos<=target){
        if(pos==target){
            System.out.println(pos);;
        }
        count++;
        if(pos+count == target){
            System.out.println(pos+count);
        }
        else
        pos=pos-count;
    }
    }


}
