public class allocation {
   static boolean isValid(int arr[],int n,int k,int max){

        int student=1;
        int sum =0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>max){
                student++;
                sum+=arr[i];

            }
            if(student>k){                      //Aloocation of books
                
                return false;
            }

        }
        return true;

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int k=2;
        int n=arr.length;
        int start=arr[arr.length-1];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
       
       int end=sum;
       int res=-1;
       while(start<=end){
        int mid= start+(end-start)/2;
        if(isValid(arr, n, k, mid)==true){
            res=mid;
            end=mid-1;
        }else{
            start=mid+1;
        }
        

       
       }
       System.out.println(res);
    }
    
}
