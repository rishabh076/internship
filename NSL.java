import java.util.ArrayList;
import java.util.Stack;

public class NSL {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> l= new ArrayList<>();
        int arr[]={4,5,2,10,8};
        for(int i=0;i<arr.length;i++){
            if(s.size()==0){
                l.add(-1);
            }else if(s.size()>0 && s.peek()<arr[i]){           //Nearest Smaller to left
                
                l.add(s.peek());
            }
            else if(s.size()>0 && s.peek()>=arr[i]){
                while(s.size()>0 && s.peek()>=arr[i]){
                    s.pop();
                }
                if(s.size()==0){
                    l.add(-1);
                }else{
                    l.add(s.peek());
                }
            }
            s.add(arr[i]);
            
        }
        System.out.println("your list  is   : "+l);
        
    }
    
}
