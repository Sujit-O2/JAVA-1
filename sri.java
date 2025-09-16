import java.util.HashMap;

public class sri {
    int cn(String s){
        HashMap<Character ,Integer>ff=new HashMap<>();
        int j=0;
        int maxlen=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(ff.containsKey(c)){
                j=ff.get(c)+1;
            }
            ff.put(c,i);
            if(i-j+1>maxlen){
                maxlen=i-j+1;
                start=j;
            }



        }
        return maxlen;

    }
    
}
