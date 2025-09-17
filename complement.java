public class complement {

}
class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        StringBuilder bb=new StringBuilder();
        int num2=0;
        for(char c:s.toCharArray() ){
            if(c=='0'){
                bb.append('1');
            }
            else 
            bb.append('0');
             
        }
        return Integer.parseInt(bb.toString(),2);
        
    }
}