import java.util.Arrays;

public class bpair {
    public static void main(String[] args) {
        int arr[]={5,20,3,2,5,80};
        int x=78;
        Arrays.sort(arr);
        int j=0;
        int i=0;
        while(i<arr.length && j<arr.length){
            if(arr[i]+arr[j]==x){
                System.out.println(arr[i]+" "+arr[j]);
                return;
            }
            else if(arr[i]+arr[j]<x){
                j++;
            }else{
                i++;
            }
        }
        System.out.println(-1);
    }
    
}
