import java.util.Arrays;

public class star {
    public static void main(String[] args) {
        int n=4;
        int a=n*2-1;
        String aa[][]=new String[n][a];
        for(int i=0;i<n;i++)
        Arrays.fill(aa[i]," ");
      for (int i = 0; i < n; i++) {
            for (int j = i; j < a - i; j += 2) {
                aa[i][j] = "*";
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<a;j++){
                System.out.print(aa[i][j]);
            }
            System.out.println();
        }
        
        }
    }

