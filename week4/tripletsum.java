

public class tripletsum {
    public static void main(String[] args) {
       int arr[]= {-1,2,1,-4}, targetSum = 1;
       int minDifference=Integer.MAX_VALUE;
       int closestSum=Integer.MAX_VALUE;

       for(int i=0;i<arr.length;i++){
        int start=i+1;
        int end=arr.length-1;

        while(start<end){
            int tripletSum=arr[i]+arr[start]+arr[end];
            if(Math.abs(targetSum-tripletSum)<=minDifference   && tripletSum<closestSum){
                minDifference=Math.abs(targetSum-tripletSum);
                closestSum=tripletSum;

            } 
            if(tripletSum==targetSum){
                System.out.println(tripletSum);

            }else if(tripletSum<targetSum){
                start++;

            }else{
                end--;
            }
        }
       }
       System.out.println(closestSum); 
    }
    
}
