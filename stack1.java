import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        Stack<Integer> s=new Stack<Integer>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(s.size()==0){
                l.add(-1);
            }else if(s.size()>0 && s.peek()>arr[i]){           //next largest element also nearest greatre to right 
                
                l.add(s.peek());
            }
            else if(s.size()>0 && s.peek()<=arr[i]){
                while(s.size()>0 && s.peek()<=arr[i]){
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
        Collections.reverse(l);
        System.out.println("Your ans is : "+l);


    }
    
}
