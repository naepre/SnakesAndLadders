import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bishop extends Figures{

    private char name;
    private char color;
    private int x;
    private int y;


    public Bishop(char name, char color, int x, int y){
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;

    }

    public char getName(){
        return this.name;
    }

    public char getColor(){
        return this.color;
    }

    public ArrayList move (int x, int y, char[][][] board)
    {
        ArrayList possibleMoves = new ArrayList<>();
        for (int i = x+1, j = y+1; i <= 6 && j <= 6; i++, j++) {
            if (board[j][i].length != 0){
                int[] figPos = {j, i};
                Object[] cell = {board[j][i], figPos};
                possibleMoves.add(cell);
                break;
            }
        }
        for (int i = x+1, j = y-1; i <= 6 && j >= 1; i++, j--) {
            if (board[j][i].length != 0){
                int[] figPos = {j, i};
                Object[] cell = {board[j][i], figPos};
                possibleMoves.add(cell);
                break;
            }
        }
        for (int i = x-1, j = y+1; i <= 1 && j <= 6; i--, j++) {
            if (board[j][i].length != 0){
                int[] figPos = {j, i};
                Object[] cell = {board[j][i], figPos};
                possibleMoves.add(cell);
                break;
            }
        }
        for (int i = x-1, j = y-1; i <= 1 && j <= 1; i--, j--) {
            if (board[j][i].length != 0){
                int[] figPos = {j, i};
                Object[] cell = {board[j][i], figPos};
                possibleMoves.add(cell);
                break;
            }
        }
        return possibleMoves;
    }
}