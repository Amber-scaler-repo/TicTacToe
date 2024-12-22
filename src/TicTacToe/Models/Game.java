package TicTacToe.Models;

import TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int nextPlayerIndex;
    private GameState gameState;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;
    private Player winner;

    public Game(GameBuilder builder){
        this.board = builder.board;
        this.players = builder.players;
        this.nextPlayerIndex = builder.nextPlayerIndex;
        this.gameState = builder.gameState;
        this.moves = builder.moves;
        this.winner = null;
        this.winningStrategies = builder.winningStrategies;

    }

    public GameBuilder getBuilder(List<Player> players, int size, List<WinningStrategy> winningStrategies){
        return new GameBuilder();
    }

    public static class GameBuilder{
        private Board board;
        private List<Player> players;
        private int nextPlayerIndex;
        private GameState gameState;
        private List<Move> moves;
        private List<WinningStrategy> winningStrategies;
        private Player winner;

        public GameBuilder(){}

        public GameBuilder Board(int size){
            this.board = new Board(size);
            return this;
        }

        public GameBuilder setPlayers(List<Player> players){
            this.players = players;
            return this;
        }

        public GameBuilder setNextPlayerIndex(int nextPlayerIndex){
            this.nextPlayerIndex = nextPlayerIndex;
            return this;
        }

        public GameBuilder setGameState(GameState gameState){
            this.gameState = gameState;
            return this;
        }

        public GameBuilder setMoves(List<Move> moves){
            this.moves = moves;
            return this;
        }

        public GameBuilder setWinningStrategies(List<WinningStrategy> winningStrategies){
            this.winningStrategies = winningStrategies;
            return this;
        }

        public static Game build(GameBuilder builder){
            return new Game(builder);
        }
    }

//    public Player getWinner() {
//        return winner;
//    }
//
//    public void setWinner(Player winner) {
//        this.winner = winner;
//    }
//
//    public Board getBoard() {
//        return board;
//    }
//
//    public void setBoard(Board board) {
//        this.board = board;
//    }
//
//    public List<Player> getPlayers() {
//        return players;
//    }
//
//    public void setPlayers(List<Player> players) {
//        this.players = players;
//    }
//
//    public int getNextPlayerIndex() {
//        return nextPlayerIndex;
//    }
//
//    public void setNextPlayerIndex(int nextPlayerIndex) {
//        this.nextPlayerIndex = nextPlayerIndex;
//    }
//
//    public GameState getGameState() {
//        return gameState;
//    }
//
//    public void setGameState(GameState gameState) {
//        this.gameState = gameState;
//    }
//
//    public List<Move> getMoves() {
//        return moves;
//    }
//
//    public void setMoves(List<Move> moves) {
//        this.moves = moves;
//    }
//
//    public List<WinningStrategy> getWinningStrategies() {
//        return winningStrategies;
//    }
//
//    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
//        this.winningStrategies = winningStrategies;
//    }

    public void displayBoard(){
        board.display();
    }
}
