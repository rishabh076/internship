import java.util.HashMap;



public class pair {
    public static void main(String[] args) {
        int arr[]={5,20,3,2,5,80};
        int n=arr.length;
        int x=78;
        int result =0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], 1);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]+x)){
                result=1;
                break;

            }
        }
       System.out.println(result);
    }
    
}
