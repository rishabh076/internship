public class rainwater {
    public static void main(String[] args) {
        int arr[]={3,0,0,2,0,4};
        int mxl[]=new int[arr.length];
        int mxr[]=new int[arr.length];
        mxl[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            mxl[i]=Math.max(mxl[i-1], arr[i]);
        }

        mxr[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            mxr[i]= Math.max(mxr[i+1],arr[i]);
        }
        int water[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            water[i]= Math.min(mxl[i], mxr[i])-arr[i];
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+water[i];
        }
        System.out.println(sum);
    }
    
}
