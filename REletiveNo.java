import java.util.Arrays;

public class REletiveNo {
}
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int a[]=score.clone();
        Arrays.sort(a);

        String a1[]=new String[a.length];

        for(int i=a.length-1;i>=0;i--){
            String s1=new String();

            if(i== a.length-1)
            s1="Gold Medal";
            
            else if(i==a.length-2)
           s1="Silver Medal";

            else if(i==a.length-3)
            s1="Bronze Medal";

            else{
                s1=a.length-i+"";
            }
            for(int j=0;j<a.length;j++){
                if(score[j]==a[i]){
                    a1[j]=s1;
                    break;

                }
            }

        }
        return a1;
        
    }
}