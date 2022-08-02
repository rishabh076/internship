import java.util.Arrays;

public class closestsum {
    public static void main(String[] args) {
        int arr[]={-1,2,1,-4};
        int t=1;
        Arrays.sort(arr);
        int min=0;
        for(int k=0;k<arr.length-2;k++){
            int i=k+1;
            int j=arr.length-1;

            while(i<j){
                int sum=arr[i]+arr[j]+arr[k];
                if(t>=sum){
                    min=Math.min(min, sum);
                    i++;
                    j--;
                }
            }

        }
        System.out.println(min);
   
    }
    
}
