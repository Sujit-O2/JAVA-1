public class ddd {
    public static void main(String[] args) {
        
    }
    
}
class Solution {
    // public String addBinary(String a, String b) {
    //     int a1=Integer.parseInt(a,2);
    //     int b1=Integer.parseInt(b,2);
    //     int c=a1+b1;
    //     return Integer.toBinaryString(c);

        
    // }
     public String addBinary(String a, String b) {
       int i=a.length();
       int j=b.length();
       int carry=0;
       StringBuffer bf=new StringBuffer();
       while(i!=0||j!=0||carry!=0){
        int a1=(i>=0)?a.charAt(i)-'0':0;
        int b1=(j>=0)?b.charAt(j)-'0':0;
        int c=a1+b1+carry;
        bf.append(c%2);
        carry=c/2;
       }
       return bf.reverse().toString();
     }

}
