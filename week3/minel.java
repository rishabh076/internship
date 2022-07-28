public class minel {
    public static void main(String[] args) {
        int arr[]={1,3,8,10,15};
        int l=0;
        int key=12;
        int h=arr.length-1;
         while(l<=h){
            int mid =l+h/2;
            if(key==arr[mid]){
                System.out.println(arr[mid]);
                break;

         }else if(key < arr[mid]){
            h=mid-1;
         }else{
            l=mid+1;
         }

         int res= Math.min(arr[l]-key, arr[h]-key);

         System.out.println(res);



    }
    

}
}
