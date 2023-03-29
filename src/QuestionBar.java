import javax.swing.*;

public class QuestionBar extends JPanel {
    String question;
    MainGuessWho form;
    public QuestionBar(MainGuessWho form){
        this.form = form;

        JTextField questiontxt = form.getQuestionBarTextField();
        questiontxt.getText();

        form.getSubmitButton().addActionListener(e->{
            int input = JOptionPane.showConfirmDialog(null, "Are you sure this is your question?");
            //0=yes 1=no 2=cancel
            System.out.println(input);
        });
    }


}
