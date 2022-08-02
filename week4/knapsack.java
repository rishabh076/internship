

public class knapsack {
    public static int knapSack(int wt[],int vl[],int w,int n){
        if(n==0 || w==0){
            return 0;
        }

        if(wt[n-1]<=w){
          
           return Math.max(vl[n-1]+knapSack(wt, vl, w-wt[n-1], n-1), knapSack(wt, vl, w, n-1));
        }
        else if(wt[n-1]>w){
            knapSack(wt, vl, w, n-1);
        }
        return -1;
        
      
    }
    public static void main(String[] args) {
        int wt[]={10,20,30};
        int vl[]={60,100,120};
        int w=50;
        int n=wt.length;
        System.out.println(knapSack(wt, vl, w, n));
        
    }
    
}
