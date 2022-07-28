import java.util.Arrays;



public class count {
    public static void main(String[] args) {
        int arr[]={-2,0,1,2};
        Arrays.sort(arr);
        int sum=2;
        int count =0;
        int n=arr.length;
        for(int k=0;k<arr.length-2;k++){
             int i=k+1;
             int j=n-1;
            while(i<j){
                int s=arr[i]+arr[j]+arr[k];
                if(s<sum){
                    count+=(j-i);
                }
                else
                    j--;
                
            }

        }
        System.out.println(count);

      
       
    }


    
}
