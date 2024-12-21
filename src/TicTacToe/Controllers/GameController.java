package TicTacToe.Controllers;

import TicTacToe.Models.Game;
import TicTacToe.Models.GameState;
import TicTacToe.Models.Player;
import TicTacToe.Strategies.RowWinningStrategy;
import TicTacToe.Strategies.WinningStrategy;

import java.util.List;
import java.util.Scanner;

public class GameController {

    Scanner scr = new Scanner(System.in);

    public Game startGame(List<Player> players, int size, List<WinningStrategy> winningStrategies) {
        return new Game(players, size, winningStrategies);
    }

    public void makeMove(int row, int col){
        System.out.println("Please enter a valid row");
        scr.nextLine();
        System.out.println("Please enter a valid column");
        scr.nextLine();
    }

    public void Undo(){}

    public void Display(){}

    public GameState getGameState(){
        return null;
    }

    public Player getWinner(){
        return null;
    }
}
