package view;

import controller.Game;

/**
 * Created by Kengoroo_a on 02.04.2017.
 */
public class ConsoleView {

    private final Game game;

    public ConsoleView(final Game game) {
        this.game = game;
    }

    public void showGameName() {
        System.out.println(game.getGameName());
    }

    public void showPlayersName() {
        System.out.println(game.getPlayers());
    }
}
