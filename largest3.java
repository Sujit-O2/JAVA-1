public class largest3 {
    public static void main(String[] args) {
        System.out.println(new Solution().largestGoodInteger("6777133339"
));
    }
    
}
class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder bb=new StringBuilder("");
         StringBuilder bigone=new StringBuilder("");
        for(int i=0;i<num.length()-2;i++){
            bb.setLength(0);
            bb.append(num.charAt(i));
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i)==num.charAt(i+2)){
                bb.append(num.charAt(i+1));
                bb.append(num.charAt(i+2));
                i=i+2;
                if(bb.compareTo(bigone)>0){
                    bigone=new StringBuilder(bb);
                }
            }
        }
        return bigone.toString();
    }
}