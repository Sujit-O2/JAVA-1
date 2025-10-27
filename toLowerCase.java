public class toLowerCase {
    
}
class Solution {
    public String toLowerCase(String s) {
        StringBuilder bb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c>=65&&c<=91){
                bb.append((char)(c+32));
            }
            else
            bb.append(c);


        }
        return bb.toString();
        
    }
}