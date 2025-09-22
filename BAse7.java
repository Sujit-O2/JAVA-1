public class BAse7 {
    
}
class Solution {
    public String convertToBase7(int num) {
        if(num==0)return "0";
        boolean isnege=false;
        if(num<0){
            isnege =true;
        
        num=Math.abs(num);
        StringBuilder bb=new StringBuilder();

        while(num!=0){
            bb.append(num%7);
            num=num/7;

        }
        if(isnege){
            bb.append("-");
        }
        return bb.reverse().toString();
        
    }
}