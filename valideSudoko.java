public class valideSudoko {

    
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int k=0;k<board.length;k++)
        for(int i=0;i<board.length;i++){
            for(int j=i;j<board.length;j++){
                if(board[k][i]==board[i][j]||board[k][i]==board[j][i]){
                    return false;
                }
            }
        }
        return true;
        
    }
}