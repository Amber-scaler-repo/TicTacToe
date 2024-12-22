package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.Models.*;
import TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Scanner scr = new Scanner(System.in);

        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer(1, "Amber",new Symbol('X')));
        players.add(new Bot(2, "Botty", new Symbol('O'), BotDifficultyLevel.EASY));
        int size = players.size()+1;
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        Game game  = gameController.startGame(players,size,winningStrategies);

        gameController.Display(game);
        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
            gameController.Display(game);
            System.out.println("Please enter a valid row");
            int row = scr.nextInt();
            System.out.println("Please enter a valid column");
            int col = scr.nextInt();
            //gameController.makeMove(game);
        }

        if(gameController.getGameState(game).equals(GameState.SUCCESS)){
            System.out.println("Winner " + gameController.getWinner().getName());
        }else if(gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("Game ends in a draw.");
        }
    }
}
