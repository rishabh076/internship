import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

public class areaofhistogram {
    public static void main(String[] args) {
        int arr[]={4,2,1,5,6,3,2,4,2};
        int maxArea=0;

        Stack<Integer> s= new Stack<>();

        ArrayList<Integer> nsl= new ArrayList<>();
       
        for(int i=0;i<arr.length;i++){
            if(s.size()==0){
                nsl.add(-1);
            }else if(s.size()>0 && arr[s.peek()]<arr[i]){           //Nearest Smaller to left index
                
                nsl.add(s.peek());
            }
            else if(s.size()>0 && arr[s.peek()]>=arr[i]){
                while(s.size()>0 && arr[s.peek()]>=arr[i]){
                    s.pop();
                }
                if(s.size()==0){
                    nsl.add(-1);
                }else{
                    nsl.add(s.peek());
                }
            }
            s.add(i);
            
        }
        ///System.out.println("your list  is   : "+nsl);


        ArrayList<Integer> nsr= new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            if(s.size()==0){
                nsr.add(arr.length);
            }else if(s.size()>0 && arr[s.peek()]<arr[i]){           //Nearest Smaller to Right index
                
                nsr.add(s.peek());
            }
            else if(s.size()>0 && arr[s.peek()]>=arr[i]){
                while(s.size()>0 && arr[s.peek()]>=arr[i]){
                    s.pop();
                }
                if(s.size()==0){
                    nsr.add(arr.length);
                }else{
                    nsr.add(s.peek());
                }
            }
            s.add(i);
            
        }
        Collections.reverse(nsr);
       // System.out.println("your list  is   : "+nsr); 

       for(int i=0;i<arr.length;i++){
        int currArea=(nsr.get(i)-nsl.get(i)-1)*arr[i];
        maxArea=Math.max(currArea, maxArea);

       }
       System.out.println(maxArea);

       
        

    }
    
}
