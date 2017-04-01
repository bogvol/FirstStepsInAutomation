import controller.Game;
import model.Board;

/**
 * Created by Kengoroo_a on 01.04.2017.
 */
public class Main {

    public static void main(String[] args) {

        final Board board = new Board();

        final Game game = new Game();
        game.getGameName();

        final TwoPlayersGame twoPlayersGame = new TwoPlayersGame("Slava", "Max");
        twoPlayersGame.printPlayer1Name();
        twoPlayersGame.printPlayer2Name();
        twoPlayersGame.getGameName();

        final ThreePlayersGame threePlayersGame = new ThreePlayersGame("Slava", "Max", "Oleg");
        threePlayersGame.printPlayer1Name();
        threePlayersGame.printPlayer2Name();
        threePlayersGame.printPlayer3Name();
        threePlayersGame.getGameName();

        printGameNameAndBoard(threePlayersGame, board);
    }

    private static void printGameNameAndBoard(final Game game, final Board board) {
        game.getGameName();
        System.out.println("=================");
        board.printBoard();


    }
}
