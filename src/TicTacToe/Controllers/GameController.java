package TicTacToe.Controllers;

import TicTacToe.Models.*;
import TicTacToe.Strategies.RowWinningStrategy;
import TicTacToe.Strategies.WinningStrategy;

import java.util.List;
import java.util.Scanner;

public class GameController {

    Scanner scr = new Scanner(System.in);

    public Game startGame(List<Player> players, int size, List<WinningStrategy> winningStrategies) {
        return new Game.getBuilder(players, size, winningStrategies);
    }

    public void makeMove(Game game, int row, int col){
        //Move move = new Move(new Cell(), game.pla);
    }

    public void Undo(){}

    public void Display(Game game){
        game.displayBoard();
    }

    public GameState getGameState(Game game){

        return GameState.IN_PROGRESS;
    }

    public Player getWinner(){
        return null;
    }
}
