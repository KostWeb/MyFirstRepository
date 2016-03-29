package com.kostweb.xo.controller;

import com.kostweb.xo.model.Player;

/**
 * Created by kostweb on 3/29/16.
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
