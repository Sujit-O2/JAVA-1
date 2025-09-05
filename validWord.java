public class validWord {
    
}
class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vow =0;
        int con =0;
        for(int i=0;i<word.length();i++){
            if(Character.isAlphabetic(word.charAt(i))){
                if(Character.toLowerCase(word.charAt(i))=='a'||Character.toLowerCase(word.charAt(i))=='e'||Character.toLowerCase(word.charAt(i))=='i'||Character.toLowerCase(word.charAt(i))=='o'||Character.toLowerCase(word.charAt(i))=='u'){
                    vow++;
                }
                else{con++;}
            }
            else if(!Character.isDigit(word.charAt(i))&&!Character.isAlphabetic(word.charAt(i))){
                return false;
            }
        }
        if(vow>0&&con>0){
            return true;
        }
        return false;
        
    }
}