import java.util.HashSet;
public class longest {
    

        
    
    public static void main(String[] args) {
        String S="geeksforgeeks";
        HashSet<Character> seen= new HashSet<>();
        int left=0;
        int right=0;
        int max=0;
        
        while(right<S.length()){
            char c= S.charAt(right);
            
            if(seen.add(c)){
                max=Math.max(max,right-left+1);
                right++;
            }else{
                while(S.charAt(left)!=c){
                    seen.remove(S.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
            }
        }
        System.out.println(max);
        
        
      
        
    }
    
}
