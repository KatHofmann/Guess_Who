import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGuessWho {
    private JLabel GuessWhoLabel;
    private JPanel FacesPanel;
    private JPanel PersonPanel;
    private JLabel QuestionBarLabel;
    private JTextField QuestionBarTextField;
    private JButton endTurnButton;
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
    private JPanel gameBoard;
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
        return endTurnButton;
    }

    public JRadioButton getRadioButton1() {
        return radioButton1;
    }

    public JPanel getGameBoard() {
        return gameBoard;
    }

    public JPanel get_006() {
        return _006;
    }

    public JPanel get_001() {
        return _001;
    }

    public JPanel get_002() {
        return _002;
    }

    public JPanel get_003() {
        return _003;
    }

    public JPanel get_004() {
        return _004;
    }

    public JPanel get_005() {
        return _005;
    }

    public JPanel get_007() {
        return _007;
    }

    public JPanel get_008() {
        return _008;
    }

    public JPanel get_009() {
        return _009;
    }

    public JPanel get_010() {
        return _010;
    }

    public JPanel get_011() {
        return _011;
    }

    public JPanel get_012() {
        return _012;
    }

    public JPanel get_013() {
        return _013;
    }

    public JPanel get_014() {
        return _014;
    }

    public JPanel get_015() {
        return _015;
    }

    public JPanel get_016() {
        return _016;
    }

    public JPanel get_017() {
        return _017;
    }

    public JPanel get_018() {
        return _018;
    }

    public JPanel get_019() {
        return _019;
    }

    public JPanel get_020() {
        return _020;
    }

    public JPanel get_021() {
        return _021;
    }

    public JPanel get_022() {
        return _022;
    }

    public JPanel get_023() {
        return _023;
    }

    public JPanel get_024() {
        return _024;
    }

    public MainGuessWho() {

        endTurnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        QuestionBarTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getPersonPanel().setVisible(false);
                getGameBoard().setVisible(false);
                JFrame secondPanel = new JFrame();
                secondPanel.setLayout(new FlowLayout());
                secondPanel.setMinimumSize(new Dimension(500,500));
                secondPanel.setMaximumSize(new Dimension(500,500));

                JLabel display = new JLabel();
                JLabel question = new JLabel();
                display.setText("Question: ");
                question.setText(getQuestionBarTextField().getText());
                secondPanel.add(display);
                secondPanel.add(question);

                JButton yes = new JButton();
                yes.setText("Yes");
                yes.setBackground(Color.GREEN);
                yes.addActionListener(a -> {
                    secondPanel.setVisible(false);
                    getPersonPanel().setVisible(true);
                    getGameBoard().setVisible(true);

                });

                JButton no = new JButton();
                no.setBackground(Color.RED);
                no.setText("No");
                no.addActionListener( a -> {
                    secondPanel.setVisible(false);
                    getPersonPanel().setVisible(true);
                    getGameBoard().setVisible(true);


                });


                secondPanel.add(yes);
                secondPanel.add(no);

                getQuestionBarTextField().setText(null);
                secondPanel.pack();
                secondPanel.setVisible(true);

            }
        });

    }
}
