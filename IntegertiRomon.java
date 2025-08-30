public class IntegertiRomon {
    
}
class Solution {
    public String intToRoman(int num) {
        StringBuilder bb=new StringBuilder();
        int value[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] sha={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                num-=value[i];
                bb.append(sha[i]);
            }
        }
        return bb.toString();
        }

    }
