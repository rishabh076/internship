import java.util.ArrayList;

public class longestcommonprefix {
    public static void main(String[] args) {
        String arr[]={"flower","flow","flight"};
        ArrayList<Character> list= new ArrayList<>();

        for(int i=0;i<arr[0].length();i++){
            char ch=arr[0].charAt(i);
            boolean match=true;

            for(int j=1;i<arr.length;j++){
                if(arr[j].length()<i || ch !=arr[j].charAt(i)){
                    match=false;
                    break;

                }

            }
            if(match==false){
                break;
            }else{
                list.add(ch);
            }
        }
        System.out.println(list);
    }
    
}
