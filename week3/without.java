

public class without {
    public static void main(String[] args) {
        int arr[]={5, 5, 10, 100, 10, 5};
        int ans=0;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]!=arr[i+1]){
                int sum=arr[i]+arr[i+1];
                ans =Math.max(sum, ans);
            }
            
        }
        System.out.println("Your maximum sum is "+ans);
    }
    
}
