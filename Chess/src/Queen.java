import java.util.ArrayList;
import java.util.List;

public class Queen extends Figures{

    private String name;
    private String color;
    private int x;
    private int y;

    public Queen(String name, String color, int x, int y){
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public List move (int x, int y, String[][] board) {
        ArrayList possibleMoves = new ArrayList<>();
        for (int i = x + 1, j = y + 1; i <= 7 && j <= 7; i++, j++) {
            if (board[y][i] != null) {
                possibleMoves.add(board[j][i]);
                break;
            }
        }
        for (int i = x + 1, j = y - 1; i <= 7 && j >= 0; i++, j--) {
            if (board[y][i] != null) {
                possibleMoves.add(board[j][i]);
                break;
            }
        }
        for (int i = x - 1, j = y + 1; i <= 0 && j <= 7; i--, j++) {
            if (board[y][i] != null) {
                possibleMoves.add(board[j][i]);
                break;
            }
        }
        for (int i = x - 1, j = y - 1; i <= 0 && j <= 0; i--, j--) {
            if (board[y][i] != null) {
                possibleMoves.add(board[j][i]);
                break;
            }
        }
        for (int i = x + 1; i <= 7; i++) {
            if (board[y][i] != null) {
                possibleMoves.add(board[y][i]);
                break;
            }

        }
        for (int i = x - 1; i >= 0; i--) {
            if (board[y][i] != null) {
                possibleMoves.add(board[y][i]);
                break;
            }
        }
        for (int i = y + 1; i <= 7; i++) {
            if (board[i][x] != null) {
                possibleMoves.add(board[i][x]);
                break;
            }
        }
        for (int i = y - 1; i >= 0; i--) {
            if (board[i][x] != null) {
                possibleMoves.add(board[i][x]);
                break;
            }
        }
        return possibleMoves;
    }
}
