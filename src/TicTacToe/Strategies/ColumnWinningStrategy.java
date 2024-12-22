package TicTacToe.Strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Move;

import java.util.HashMap;

public class ColumnWinningStrategy implements WinningStrategy {

    private HashMap<Integer, HashMap<Character, Integer>>  colWinningMap= new HashMap<>();
    public boolean checkWinner(Board board, Move move) {
        System.out.println("Checking the winner in a column.");

        Integer col = move.getCell().getCol();
        Character sym = move.getCell().getSymbol().getCharSymbol();

        if(!colWinningMap.containsKey(col)){
            colWinningMap.put(col, new HashMap<>());
        }

        HashMap<Character, Integer> counts = colWinningMap.get(col);
        counts.put(sym,colWinningMap.get(col).getOrDefault(sym,0)+1);

        //counts.put(sym,counts.getOrDefault(sym,0)+1);
        colWinningMap.put(col,counts);

        if(colWinningMap.get(col).get(sym) == board.getSize()){
            return true;
        }
        return false;
    }
}
