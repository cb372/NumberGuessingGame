package com.github.cb372.guessing;

/**
 * Author: chris
 * Created: 6/2/14
 */
public class Main {

    static Game game = null;

    public static void main(String[] args) throws Exception {
        game = new Game();

        game.run();
    }

}
