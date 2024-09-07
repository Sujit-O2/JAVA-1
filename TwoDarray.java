import java.io.*;
import java.util.regex.*;



public class TwoDarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
        int A[][]=new int[6][6];
        int l=0;
      for(int i=0;i<6;i++){
        String aa=bb.readLine();
        Pattern pp= Pattern.compile("[-]?\\w");
        Matcher mm=pp.matcher(aa);
        
        while(mm.find()){
            A[i][l]=Integer.parseInt(aa.substring(mm.start(),mm.end()));
            l++;
        }
        l=0;
      }
      int sum=0;
      int k=0;
      int Aa[]=new int[4*4];
      for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
              sum=A[i][j]+A[i][j+1]+A[i][j+2]+A[i+1][j+1]+A[i+2][j]+A[i+2][j+1]+A[i+2][j+2];
              Aa[k]=sum;
              k++;
          }
       
          sum=0;
      }
       int max =Aa[0];
      for(int i=0;i<Aa.length;i++){
        if(max<Aa[i]){
            max=Aa[i];
        }
      }
      
      System.out.println(max);
        bb.close();
    }
}


