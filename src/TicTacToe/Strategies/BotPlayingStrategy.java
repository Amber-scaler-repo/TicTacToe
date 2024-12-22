package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

public interface BotPlayingStrategy {
    Move move(Board board);
}
