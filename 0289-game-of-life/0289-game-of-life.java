class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        int [][]dir=new int[][]{{-1,-1},{-1,0},{-1,1},{1,0},
        {1,1},{1,-1},{0,1},{0,-1}};
        int [][]res=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int cnt=0;
                for(int []d:dir)
                {
                    int p=i+d[0];
                    int q=j+d[1];
                    if(p>=0 && p<n && q>=0 && q<m && board[p][q]==1){
                        cnt++;
                    }
                }   
                if(board[i][j]==1){
                    if(cnt==2 || cnt==3) res[i][j]=1;
                    else res[i][j]=0;
                }
                else{
                    if(cnt==3) res[i][j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]=res[i][j];
            }
        }
    }
}