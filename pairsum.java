import java.util.HashMap;

public class pairsum {
    public static void main(String[] args) {
        int arr[]={7,3,8,6,1,4,5};
        int x=9;
        int count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], 1);  
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(x-arr[i])){
                count ++;
            }
        }
        System.out.println(count);
    }
    
}
