import java.util.Stack;

public class popPush {
    public static void main(String[] args) {
        Solution ss = new Solution();
        System.out.println(ss.isValid("(((({{}))))"));  // false
        System.out.println(ss.isValid("(){}[]"));       // true
        System.out.println(ss.isValid("([{}])"));       // true
        System.out.println(ss.isValid("(])"));         // false
    }
}

class Solution {
    public boolean isValid(String s) {
        char s1[]=new char[s.length()];
        int top=-1;
        for(char s2:s.toCharArray()){
            if(s2=='('||s2=='{'||s2=='['){

                s1[++top]=s2;


            }
            else{
                if(top==-1){
                    return false;
                }
                else if(s1[top]=='('&& s2==')' ||s1[top]=='{'&& s2=='}'||s1[top]=='['&& s2==']'){
                    top--;
                }
                else{
                    return false;
                }
            }
        }
        if(top==-1){
            return true;
        }
        else return false;

    }
}
