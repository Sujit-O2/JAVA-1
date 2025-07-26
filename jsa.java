import java.util.*;

public class jsa {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
       
        int i=1;
        while(i<=game.length-1){
            try{
           
                 if(game[i]==0){
                    i++;
                    if(i>=game.length){
                    return true;
                    }
                }
                
                if(game[i]!=0){
                    i=i-1+leap;
                    if(i>game.length){
                        return true;
                    }
                    else{
                        if(game[i-1]!=0){
                            return false;
                        }
                    }
                }}
                catch(ArrayIndexOutOfBoundsException e){
                    return true;
                }
                }
                return true;
            }
        
        

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
