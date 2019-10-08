import java.util.*;

public class main {
    public static void main(String[] args){



        Scanner keyboard = new Scanner(System.in);
        //Set up
        //1. get player count
        System.out.println("How many players are you [2-4]?");
        int numberOfPlayers = keyboard.nextInt();
        while(numberOfPlayers < 2 || numberOfPlayers > 4){
            System.out.println("Choose a number between 2 and 4 only.");
            numberOfPlayers = keyboard.nextInt();
        }

        //2. get player names
        List players = new ArrayList();
        for(int i=0; i<numberOfPlayers; i++){
            System.out.println("Enter a player name: ");
            String name = keyboard.next();
            players.add(name);
        }

        //3. set players to game object
        Game game = new Game();
        game.setPlayers(players);
        game.setCurrentTurn((String) players.get(0));

        //Map to track players current position
        Map playerCurrentPositions = new HashMap();
        for (Object player: players) {
            playerCurrentPositions.put(player, 0);
        }
        System.out.println("CURRENT PLAYER POSITIONS"+ playerCurrentPositions);


        //4. create squares
        Square squares = new Square();
        Object[][] board = squares.createSquare();
        game.setBoard(board);

        //API to manipulate game board
        Object[][] currentBoard = game.getBoard();
        System.out.println("CURRENT BOARD:"+ Arrays.deepToString(game.getBoard()));
        //read an element:
        System.out.println(currentBoard[3][2]);
        //modify an element
        currentBoard[3][2] = "some new player name";
        game.setBoard(currentBoard);
        System.out.println("UPDATED BOARD:"+ Arrays.deepToString(game.getBoard()));

        /*


        //########SETUP END############

        //START (need some loop)
        Move movePlayer = new Move();
        Dice dice = new Dice();
        int diceRoll = dice.roll();
        System.out.println("DICE ROLL: "+diceRoll);
        //get players current position


        int lastMove = movePlayer.move(0, diceRoll, game.currentTurn, currentBoard);
        System.out.println(lastMove);
        playerCurrentPositions.replace(game.currentTurn, lastMove);


*/
    }
}