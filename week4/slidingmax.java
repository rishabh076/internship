public class slidingmax {
    public static void main(String[] args) {
        int arr[]={100, 200, 300, 400};
        int k=2;

        int i=0,j=0;
        int sum=0;
        int maxsum=0;

        while(j<arr.length){
            sum=sum+arr[j];

            if((j-i+1)<k){
                j++;
            }else if((j-i+1)==k){
                maxsum=Math.max(sum, maxsum);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        System.out.println(maxsum);
    }
    
}
