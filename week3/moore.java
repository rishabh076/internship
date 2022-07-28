public class moore {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,1};
        int ansIndex=0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[ansIndex]){
                count++;
            }else{                             //MOORE'S VOTING ALGORITHM
                count--;

            }
            if(count==0){
                ansIndex=i;
                count=1;
            }

        }
        int newCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[ansIndex]){
                newCount++;
            }
        }
          System.out.println(newCount);

    }
    
}
