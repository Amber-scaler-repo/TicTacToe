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

        Game game  = gameController.startGame(players,size,winningStrategies);

        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
            gameController.Display(game);
            gameController.makeMove(row, col);
        }

        if(gameController.getGameState(game).equals(GameState.SUCCESS)){
            System.out.println("Winner " + gameController.getWinner().getName());
        }else if(gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("Game ends in a draw.");
        }
    }
}
