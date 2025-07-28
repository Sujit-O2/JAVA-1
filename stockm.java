public class stockm {
    public static void main(String[] args) {
        Solution ss=new Solution();
        int a[]={7,6,4,3,1};
        System.out.println(ss.maxProfit(a));
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0]; 
        int sell=0;
        int profit,maxProfit=0;
        int i;
        for( i=1;i<prices.length;i++){
            sell=prices[i];
            if(sell>buy){
                profit=sell-buy;
                maxProfit=Math.max(profit,maxProfit);

            }
            else{
                buy=sell;
            }
            
            
       
    }
    return maxProfit;
}
}