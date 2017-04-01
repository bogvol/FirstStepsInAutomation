package controller;

import model.Player;

/**
 * Created by Kengoroo_a on 01.04.2017.
 */
public class Game {

    public static final String GAME_NAME = "XO";

    private Player[] players;


    public String getGameName() {
        return GAME_NAME;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y) {
        return false;
    }

    public Player[] getPlayers() {
        return players;
    }
}
