package TicTacToe.Controllers;

import TicTacToe.Models.GameState;
import TicTacToe.Models.Player;
import TicTacToe.Strategies.WinningStrategy;

import java.util.List;

public class GameController {

    public void startGame(List<Player> players, int size, List<WinningStrategy> winningStrategies) {}

    public void makeMove(int row, int col){}

    public void Undo(){}

    public void Display(){}

    public GameState getGameState(){
        return null;
    }

    public Player getWinner(){
        return null;
    }
}
