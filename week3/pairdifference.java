import java.util.HashMap;

public class pairdifference {
    public static void main(String[] args) {
        int arr[]={5,20,3,2,5,80};
        int x=78;
        int count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], 1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]+x)){
                count++;
                
            }
        }
        System.out.println(count);
    }
    
}
