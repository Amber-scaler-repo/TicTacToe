package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Cell;
import TicTacToe.Models.CellState;
import TicTacToe.Models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{

    public Move move(Board board) {
        for(List<Cell> row : board.getGrid()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    new Move(new Cell(cell.getRow(), cell.getCol()),null);
                }
            }
        }
        return null;
    }
}
