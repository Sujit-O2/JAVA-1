public class MaxNotAdj {
    public static void main(String[] args) {
        
    }
    int sum(int a,int []aa){

        if(aa==null||a<0)return 0;
        if(a==0)return aa[0];
        int b=aa[a]+sum(a-2,aa);
        int c=sum(a-1,aa);

        return Math.max(b,c);



    }
     int sum(int a,int []aa ,int memo[]){


        if(aa==null||a<0)return 0;
        if(a==0)return aa[0];
        if(memo[a]!=-1){
            return memo[a];
        }
        int b=aa[a]+sum(a-2,aa,memo);
        int c=sum(a-1,aa,memo);

        return memo[a]= Math.max(b,c);



    }
    int sum(int a,int []aa,int fake){

        if(aa==null||a<0)return 0;
        if(a==0)return aa[0];
        int prev=aa[0];
        int prev2=0;
       for(int i=1;i<a;i++){
        int take=aa[i];
        if(i>1){
            take=take+prev2;
        }
        int nottake=prev;
        int curi=Math.max(take,nottake);
        prev2=prev;
        prev=curi;
        

       }

return prev;

    }
}
