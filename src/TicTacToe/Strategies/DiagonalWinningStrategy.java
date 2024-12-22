package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

import java.util.HashMap;

public class DiagonalWinningStrategy implements WinningStrategy{

    HashMap<Integer, HashMap<Character, Integer>> diagonalWinningMap = new HashMap<>();
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        char sym = move.getCell().getSymbol().getCharSymbol();

        if(row == col){
            if(!diagonalWinningMap.containsKey(row)){
                diagonalWinningMap.put(row, new HashMap<>());
            }

            HashMap<Character, Integer> counts = diagonalWinningMap.get(row);
            counts.put(sym, counts.getOrDefault(sym, 0) + 1);
            diagonalWinningMap.put(row, counts);

            if(diagonalWinningMap.get(row).get(sym) == board.getSize()){
                return true;
            }
        }
        return false;
    }
}
