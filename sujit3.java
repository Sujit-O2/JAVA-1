import java.util.HashSet;

void main(){
    System.out.println(new Solution().checkPerfectNumber(28));
}
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        if(num==1)return false;
        HashSet<Integer> hh=new HashSet();
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
               hh.add(i);
               hh.add(num/i);
            }
        }
        for(Integer i: hh){
            sum+=i;
        }
        System.out.println(sum);
        return sum==num;
    }
    
}