package com.rps.v2;

import com.rps.v2.service.GameService;
import com.rps.v2.service.GameServiceImpl;

public class main {
    public static void main(String[] args) {
        GameService gameService = new GameServiceImpl();
        gameService.startGame();
    }
}
