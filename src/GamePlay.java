import java.util.ArrayList;

public class GamePlay {
ArrayList<Portraits> player1GameBoard;
ArrayList<Portraits> player2GameBoard;
QuestionBar player1Question;
QuestionBar player2Question;
Portraits boardLoaction;

int[] index = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
    public void main(String[] args){
        /*
        1. Game starts, portraits selected by both players
        2. Player 1 submits a question to player 2
        3. Player 2 responds to question using yes/no buttons
        4. Player 1 is given an option to select portraits
        5. Player 2 receives priority
        6. Player 2 submits a question to player 1
         */


        //Game Board creation
        player1GameBoard = new ArrayList<>();
        player2GameBoard = new ArrayList<>();

        for (int i=0; i<24;i++){
            boardLoaction = player1GameBoard.get(i);
            boardLoaction.index = i;
        }
    }

}
