public class EqalDigits {
    
}
class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            StringBuffer a=new StringBuffer(s);
            for(int i=0;i<s.length()-1;i++){
                int a1=Integer.parseInt(s.charAt(i)+"");
                int a2=Integer.parseInt(s.charAt(i+1)+"");
                a.append((a1+a2)%10);

            }
            s=new String(a);
            a.delete(0,a.length());

        }
        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1)){
                return true;
            }
        }
        return false;
        
    }
}