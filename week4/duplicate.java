public class duplicate {
    public static boolean[] map= new boolean[23];
    public static void removeDuplicate(String S,int idx,String newString){
        if(idx==S.length()){
            System.out.println(newString);
            return;
        }
        char currChar=S.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicate(S, idx+1, newString);
        }else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicate(S, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String S="abbccda";
        removeDuplicate(S, 0, " ");
        
    }
    
}
