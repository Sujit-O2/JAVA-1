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
    }
}
