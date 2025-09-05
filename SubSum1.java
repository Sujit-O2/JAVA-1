public class SubSum1 {
    
   boolean isTarget(int ind,int target,int a[] ){
    if(target==0){
        return true;
    }
    if(ind==0) return (a[0]==target);
    boolean notapp=isTarget(ind-1,target,a);
    boolean app=false;
    if(target>=a[ind]){
        app=isTarget(ind-1,target-a[ind],a);
    }
    return app||notapp;
    }
    boolean isTarget(int ind,int target,int a[],Boolean dp[][] ){
    if(target==0){
        return true;
    }
    if(ind==0) return (a[0]==target);
    if(dp[ind][target]!=null)return dp[ind][target];
    boolean notapp=isTarget(ind-1,target,a,dp);
    boolean app=false;
    if(target>=a[ind]){
        app=isTarget(ind-1,target-a[ind],a,dp);
    }
    return dp[ind][target]=app||notapp;
    }

}
