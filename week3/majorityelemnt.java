import java.util.HashMap;

public class majorityelemnt {
    public static void main(String[] args) {
        int arr[]={3,3,4,2,4,4,2,4,4};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
       
          
    }
    
}
