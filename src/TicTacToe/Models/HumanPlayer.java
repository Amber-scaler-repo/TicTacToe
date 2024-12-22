package TicTacToe.Models;

public class HumanPlayer extends Player {
    private Integer level;

    public HumanPlayer(Integer id, String name,  Symbol symbol) {
        super(id, name, symbol, PlayerType.HUMAN_PLAYER);
        this.level = 1;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
