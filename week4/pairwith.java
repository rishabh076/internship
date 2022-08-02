public class pairwith {
    public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 5, 6, 7};
       int k=8;
       int i=0;
       int j=arr.length-1;
       int count=0;

       while(i<j){
        if(arr[i]+arr[j]==k){
            
            
            count++;
            i++;
            j--;
        }else if(arr[i]+arr[j]<k){
            i++;
        } 
        else{
            j--;
        }


       }
       System.out.println(count);
    }
    
}
