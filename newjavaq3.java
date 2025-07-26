public class newjavaq3 {
    public static void main(String[] args) {
        Solution ss=new Solution();
      System.out.println(  ss.romanToInt("MCMXCIV"));
    
    }
}
class Solution {
    public int romanToInt(String s) {
        
        int total=0;
        for(int i=0;i<s.length();i++){
           switch (s.charAt(i)) {
            case 'I':
            
            total+=1;
                break;
            case 'V':
            if(i>0){
            if(s.charAt(i-1)=='I'){
                total-=2;

            }
            }

            total+=5;
                
                break;
            case 'X':
             if(i>0){
            if(s.charAt(i-1)=='I'){
                total-=2;
            }
            }
            total+=10;
                break;
            case 'L':
            if(i>0){
            if(s.charAt(i-1)=='X'){
                total-=20;
            }
            }
            total+=50;
                break;
            case 'C':
            if(i>0){
            if(s.charAt(i-1)=='X'){
                total-=20;
            }
            }
            total+=100;
                
                break;
            case 'D':
            if(i>0){
            if(s.charAt(i-1)=='C'){
                total-=200;
            }
            }
            total+=500;
                
                break;
            case 'M':
            if(i>0){
            if(s.charAt(i-1)=='C'){
                total-=200;
            }
            }
            total+=1000;
                break;
           
            
           }

        }
 return total;
    }
}