public class ble {
    public static void main(String[] args) {
        int count =new ble().lengthOfLongestSubstring("abcabcbb");
        System.out.println(count);
    }

      public int lengthOfLongestSubstring(String s) {
       
        int j=1;
        int maxCount=0;
        int count=1;
         String sub=s.substring(0,j);
        while(j<s.length()){
            if(sub.contains(""+s.charAt(j))){
                int ind=sub.indexOf(s.charAt(j));
                sub=sub.substring(ind+1)+s.charAt(j);
                j++;
                count=1;

            }
            else{
                sub=sub+""+s.charAt(j);
                j++;
                count=sub.length();
                if(count>maxCount){
                    maxCount=count;
                }
            }



        }
        return maxCount;
        
    }
}