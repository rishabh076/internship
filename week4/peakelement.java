public class peakelement {
    public static void main(String[] args) {
       int nums[] ={2,1};
       int max=nums[0];
       for(int i=1;i<nums.length-1;i++){
        
        int currmax=Math.max(nums[i],nums[i+1]);
        max=Math.max(currmax, max);

       }
       System.out.println(max);


       for(int i=0;i<nums.length;i++){
        if(nums[i]==max){
            System.out.println(i);

        }
       }
    }
    
}
