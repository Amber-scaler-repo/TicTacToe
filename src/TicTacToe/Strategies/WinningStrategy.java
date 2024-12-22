package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface WinningStrategy {
     boolean checkWinner(Board board, Move move);
}
