package com.kostweb.xo;

import com.kostweb.xo.controller.Game;
import com.kostweb.xo.view.*;


/**
 * Created by kostweb on 3/29/16.
 */
public class Main {

    public static void main(String[] args) {
        final Game game = new Game();
        final AdvConsoleView view = new AdvConsoleView(game);
        startGame(view);

    }

    public static void startGame(final AdvConsoleView view) {
        view.showGameName();
    }

}
