import javax.swing.*;

public class GuessWhoFrame extends JFrame {
    int whoami;
    MainGuessWho player1;
    MainGuessWho player2;

    GuessWhoFrame(int me, MainGuessWho pl1, MainGuessWho pl2) {
        super();
        whoami = me;
        player1 = pl1;
        player2 = pl2;

        setContentPane(pl1.getGameBoard());
        setVisible(true);
    }

    public int getWhoami() {
        return whoami;
    }

    public MainGuessWho getPlayer1() {
        return player1;
    }

    public MainGuessWho getPlayer2() {
        return player2;
    }
}
