public class Player {
    String name;
    int score;  //represented in number of turns
    Portraits playerPortrait;
    String playerQuestion;

    public Player(String name, int score, Portraits playerPortrait) {
        this.name = name;
        this.score = score;
        this.playerPortrait = playerPortrait;
        playerQuestion = null;

    }
}
