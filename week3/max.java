import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int arr[]={3,3,4,2,4,4,2,4,4};
        int maxCount=0;
        int count=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count+=1;
                maxCount= Math.max(count, maxCount);
            }
            //maxCount= Math.max(count, maxCount);
        }
        System.out.println(maxCount);

    }
    
}
