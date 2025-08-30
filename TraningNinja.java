public class TraningNinja {
    public int traning(int a[][],int day,int last){
        int max=0;
        if(day==0){
            
            for(int i=0;i<=2;i++){
                if(i!=last){
                    max=Math.max(max,a[day][i]);
                    
                }
            }
        }
        else{
        for(int i=0;i<=2;i++){
            
            if(i!=last){
                int point=a[day][i]+traning(a,day-1,i);
                max=Math.max(max,point);
            }
        }
    }
    return max;

}
 public int traning(int dp[][],int a[][],int day,int last){
        int max=0;
        if(dp[day][last]!=-1){
            return dp[day][last];
        }
        if(day==0){
            
            for(int i=0;i<=2;i++){
                if(i!=last){
                    max=Math.max(max,a[day][i]);
                    
                }
            }
        }
        else{
        for(int i=0;i<=2;i++){
            
            if(i!=last){
                int point=a[day][i]+traning(a,day-1,i);
                max=Math.max(max,point);
            }
        }
    }
    return dp[day][last]=max;

}
  int t(){
    
    return 0;
  }
    
}
