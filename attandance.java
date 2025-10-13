public class attandance {
    
}
class Solution {
    public boolean checkRecord(String s) {
        boolean late =s.contains("LLL");
        boolean Aps=false;
        int a=0;
        for(char c:s.toCharArray()){
            if(c=='A'){
                a++;
            }
            if(a>=2){
                Aps=true;
                break;
            }

        }
        if(late||Aps){
            return false;
        }
        return true;
        
    }
}