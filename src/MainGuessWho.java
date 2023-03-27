import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGuessWho {
    private JLabel GuessWhoLabel;
    private JPanel FacesPanel;
    private JPanel PersonPanel;
    private JLabel QuestionBarLabel;
    private JTextField QuestionBarTextField;
    private JButton submitButton;
    private JPanel _006;
    private JPanel _001;
    private JPanel _002;
    private JPanel _003;
    private JPanel _004;
    private JPanel _005;
    private JPanel _007;
    private JPanel _008;
    private JPanel _009;
    private JPanel _010;
    private JPanel _011;
    private JPanel _012;
    private JPanel _013;
    private JPanel _014;
    private JPanel _015;
    private JPanel _016;
    private JPanel _017;
    private JPanel _018;
    private JPanel _019;
    private JPanel _020;
    private JPanel _021;
    private JPanel _022;
    private JPanel _023;
    private JPanel _024;
    private JRadioButton radioButton1;

    public JLabel getGuessWhoLabel() {
        return GuessWhoLabel;
    }

    public JPanel getFacesPanel() {
        return FacesPanel;
    }

    public JPanel getPersonPanel() {
        return PersonPanel;
    }

    public JLabel getQuestionBarLabel() {
        return QuestionBarLabel;
    }

    public JTextField getQuestionBarTextField() {
        return QuestionBarTextField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JRadioButton getRadioButton1() {
        return radioButton1;
    }




    public MainGuessWho() {

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
