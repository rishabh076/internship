

public class search {
    public static int binarrySearch(int arr[],int start,int end){
        int key=50;
        int result=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key<mid){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        System.out.println(binarrySearch(arr, 0, arr.length));
       
        
    }
    
}
