package Pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nq {
    public static boolean isSafe(char [][] board,int rpw,int col){
        for (int i=0;i<rpw;i++) {
            if (board[i][col] == 'Q') {
                ;
                return false;
            }
        }
        int maxLeft=Math.min(rpw,col);
        for (int i=0;i<=maxLeft;i++){
            if (board[rpw-1][col-1]=='Q'){
                return false;
            }
        }
        int maxRight=Math.min(rpw,board.length-1-col);
        for (int i=0;i<=maxRight;i++){
            if (board[rpw-1][col+1]=='Q');
            return false;
        }
return true;
    }
    public static List<String> makeString(char [][] board){
        List<String> l=new ArrayList<>();
        for (int i=0;i<board.length;i++){
            String row=new String(board[i]);
            l.add(row);
        }
        return l;
    }
    public static void queen(char [][] board,int row,List<List<String>> ans ) {
        if (row==board.length) {
            ans.add(makeString(board));
            return;
        }
        for (int col=0;col<board.length;col++){
            if (isSafe(board,row,col)){
                board[row][col]='Q';
                queen(board,row+1,ans);
                board[row][col]='.';
            }
        }
    }
    public static List<List<String>> queen(int n){
        char [][] board=new char[n][n];
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<>();
        queen(board,0,ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(queen(n));
    }
}
