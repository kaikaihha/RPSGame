package com.rps.v2pro;

import com.rps.v2pro.service.GameService;
import com.rps.v2pro.service.GameServiceImpl;

public class main {
    public static void main(String[] args) {
        GameService gameService = new GameServiceImpl();
        gameService.startGame();
    }
}
