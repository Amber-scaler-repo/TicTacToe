package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;
import TicTacToe.Models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {

    private HashMap<Integer, HashMap<Character, Integer>> rowWinningMap = new HashMap<>();
    public boolean checkWinner(Board board, Move move) {
        System.out.println("Checking the winner in a row.");
        //return true;

        Integer row = move.getCell().getRow();
        Character sym = move.getCell().getSymbol().getCharSymbol();

        if(!rowWinningMap.containsKey(row)){
            rowWinningMap.put(row, new HashMap<>());
        }

        HashMap<Character, Integer> counts = rowWinningMap.get(row);
        counts.put(sym, counts.getOrDefault(sym, 0) + 1);
        rowWinningMap.put(row,counts);
        if(rowWinningMap.get(row).get(sym) == board.getSize()){
            return true;
        }
        return false;
    }

}
