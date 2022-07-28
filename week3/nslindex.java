import java.util.ArrayList;
import java.util.Stack;

public class nslindex {
    public static void main(String[] args) {
        int arr[]={4,2,1,5,6,3,2,4,2};
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> l= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(s.size()==0){
                l.add(-1);
            }else if(s.size()>0 && arr[s.peek()]<arr[i]){           //Nearest Smaller to left index
                
                l.add(s.peek());
            }
            else if(s.size()>0 && arr[s.peek()]>=arr[i]){
                while(s.size()>0 && arr[s.peek()]>=arr[i]){
                    s.pop();
                }
                if(s.size()==0){
                    l.add(-1);
                }else{
                    l.add(s.peek());
                }
            }
            s.add(i);
            
        }
        System.out.println("your list  is   : "+l);

    }
    
}
