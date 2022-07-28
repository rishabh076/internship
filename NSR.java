import java.util.ArrayList;

import java.util.Collections;
import java.util.Stack;

public class NSR {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> l= new ArrayList<>();
        int  arr[]={4,5,2,10,8};
        for(int i=arr.length-1;i>=0;i--){
            if(s.size()==0){
                l.add(-1);
            }else if(s.size()>0 && s.peek()<arr[i]){           //Nearest Smaller to Right
                
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
            s.push(arr[i]);
            
        }
        Collections.reverse(l);
        System.out.println("your list  is   : "+l);
        
    }
    
}
