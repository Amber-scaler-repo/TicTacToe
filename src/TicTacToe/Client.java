package TicTacToe;

import TicTacToe.Controllers.GameController;
import TicTacToe.Models.Bot;
import TicTacToe.Models.GameState;
import TicTacToe.Models.HumanPlayer;
import TicTacToe.Models.Player;
import TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer());
        players.add(new Bot());
        int size = players.size()+1;
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        gameController.startGame(players,size,winningStrategies);

        while(gameController.getGameState().equals(GameState.IN_PROGRESS)){
            gameController.Display();
        }

        if(gameController.getGameState().equals(GameState.SUCCESS)){
            System.out.println("Winner " + gameController.getWinner().getName());
        }else if(gameController.getGameState().equals(GameState.DRAW)){
            System.out.println("Game ends in a draw.");
        }
    }
}
