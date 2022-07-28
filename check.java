public class check {
    public static void main(String[] args) {
        int arr[]={4,2,1,5,6,3,2,4,2};
        int arr1[]={1, 2, 9, 5, 5, 6, 9, 8, 9};
        int arr2[]={-1, -1, -1, 2, 3, 2, 2, 6, 2};
        int maxArea=0;
        for(int i=0;i<arr.length;i++){
            int curr=(arr1[i]-arr2[i]-1)*arr[i];
            maxArea= Math.max(curr, maxArea);
        }
        System.out.println(maxArea);
    }
    
}
