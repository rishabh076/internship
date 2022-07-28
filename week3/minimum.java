public class minimum {
    public static int minElemnt(int nums[],int start,int end){
        int n=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(nums[mid]<=nums[next] && nums[mid]<=nums[prev]){
                return nums[mid];
            }
            if(nums[start]<=nums[mid]){
                start=mid+1;
            }else if(nums[mid]<=nums[end]){
                end = mid-1;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
       int nums[]={ 4,5,6,7,0,1,2};

       System.out.println(minElemnt(nums, 0, nums.length-1));
        
    }
    
}
