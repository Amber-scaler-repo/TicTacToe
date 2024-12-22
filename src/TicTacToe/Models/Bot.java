package TicTacToe.Models;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(Integer id, String name, Symbol symbol,BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol, PlayerType.BOT );
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
