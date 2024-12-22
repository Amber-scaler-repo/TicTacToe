package TicTacToe.Strategies;

import TicTacToe.Models.*;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MediumBotPlayingStrategy implements BotPlayingStrategy{
Set<Cell> set = new HashSet<>();
    public Move move(Board board){
        int size = board.getSize()-1;
        int row = generateRandomNum(size);
        int col = generateRandomNum(size);

        while(board.getGrid().get(row).get(col).getCellState().equals(CellState.Occupied))
        {
            if(set.size() == board.getSize()* board.getSize()){
                return null;
            }
            set.add(new Cell(row, col));
            row = generateRandomNum(size);
            col = generateRandomNum(size);
        }
        return new Move(new Cell(row,col),null);
    }

    public int generateRandomNum(int size){
        int num = (int)(Math.random() * 10);
        if(num > size){
            num %= size+1;
        }
        return num;
    }
}
