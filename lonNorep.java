import java.util.stream.Gatherer.Integrator;

public class lonNorep {
    public static void main(String[] args) {
        String s="aaabas";
        String sub="";
        int maxlen=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            if(!sub.contains(""+s.charAt(i))){
                sub=sub+s.charAt(i);
                if(maxlen<sub.length()){
                    maxlen=sub.length();
                }

            }
            else{
                sub=sub.substring(sub.indexOf(s.charAt(i))+1);
                sub+=s.charAt(i);
            }

        }
        int a[]={1,2,3,4,5,6,7};
        int maxcount=Integer.MAX_VALUE;
        int tar=7;
        int sum=0;
        int left=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];

            while(sum>= tar){
                maxcount=Math.min(maxcount,i-left+1);
                sum-=a[left];
                left++;

            }
            
           
                
            

        }
         int tar1=4;
         int left1=0;
         maxcount=0;
            for(int i=0;i<a.length;i++){
               sum+=a[i];
               while(sum==tar1){
                sum-=a[left1];
                left1++;
               }
               maxcount=Math.max(maxcount,i-left1+1);
                
            }

    }
}
