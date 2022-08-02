import java.util.HashSet;

public class uniquesub {
    public static HashSet<String> s= new HashSet<>();
    public static void subSeque(String str,int idx,String newString){
        if(idx==str.length()){
            if(s.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                s.add(newString);
                return;
            }
        }

        char currChar=str.charAt(idx);
        subSeque(str, idx+1, newString+currChar);
        subSeque(str, idx+1, newString);
    
    }
        
    public static void main(String[] args) {
      
        String str="abc";
        subSeque(str, 0, " ");
        
    }
    
}
