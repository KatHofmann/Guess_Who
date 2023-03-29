import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Portraits extends JPanel{
    JPanel panel;
    private MainGuessWho form;
    private static ArrayList<JPanel> portraits;

    public Portraits(MainGuessWho form,JPanel panel) {
        this.form = form;
        this.panel = panel;


    }

    private void initializePortraits(Portraits picture) {
        portraits = new ArrayList<>();
        portraits.add(form.get_001());
        portraits.add(form.get_002());
        portraits.add(form.get_003());
        portraits.add(form.get_004());
        portraits.add(form.get_005());
        portraits.add(form.get_006());
        portraits.add(form.get_007());
        portraits.add(form.get_008());
        portraits.add(form.get_009());
        portraits.add(form.get_010());
        portraits.add(form.get_011());
        portraits.add(form.get_012());
        portraits.add(form.get_013());
        portraits.add(form.get_014());
        portraits.add(form.get_015());
        portraits.add(form.get_016());
        portraits.add(form.get_017());
        portraits.add(form.get_018());
        portraits.add(form.get_019());
        portraits.add(form.get_020());
        portraits.add(form.get_021());
        portraits.add(form.get_022());
        portraits.add(form.get_023());
        portraits.add(form.get_024());

        JLabel name = new JLabel();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Jack");
        strings.add("Armando");
        strings.add("Bob");
        strings.add("Thomas");
        strings.add("CHAD");
        strings.add("Terry");
        strings.add("Susan");
        strings.add("Katie");
        strings.add("Alex");
        strings.add("Karen");
        strings.add("Britney");
        strings.add("Sallie");
        strings.add("Kayleigh");
        strings.add("Brianna");
        strings.add("Chelsea");
        strings.add("Mia");
        strings.add("Candice");
        strings.add("Dominique");
        strings.add("Aaron but spelled Erin");
        strings.add("Hanna");
        strings.add("Valerie");
        strings.add("Greg");
        strings.add("Rosemarie");
        strings.add("Fred");

        for (JPanel panel : picture.portraits) {
            int i = picture.portraits.indexOf(panel);
            ImageIcon image;
            image = new ImageIcon("Portrait images/Mii " + i + ".jpg");
            ImageIcon scaledImage = new ImageIcon(image.getImage().getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH));
            JButton label = new JButton(scaledImage);
            label.setBackground(Color.white);
            panel.add(label);
            name.setText(strings.get(i));
            panel.add(name);



            label.addActionListener(e->{
                if(label.getBackground()== Color.black) {
                    //label.setVisible(!label.isVisible());
                    label.setBackground(Color.white);
                    panel.setBackground(Color.white);
                }else{
                    label.setBackground(Color.black);
                    panel.setBackground(Color.black);
                }
            });
        }
    }
    public void selectPerson(MainGuessWho form){
        JPanel person = form.getPersonPanel();
        ImageIcon image;
        Random rand = new Random();
        int i = rand.nextInt(24);
        image = new ImageIcon("Portrait images/Mii "+i+".jpg");
        //ImageIcon scaledImage = new ImageIcon(image.getImage().getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH));
        JButton label = new JButton(image);
        label.setBackground(Color.white);
        person.add(label);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MainGuessWho form = new MainGuessWho();
        JPanel content = form.getGameBoard();
        frame.setContentPane(content);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        frame.setSize(width,height);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Portraits pictures = new Portraits(form, new JPanel());
        pictures.initializePortraits(pictures);

        pictures.selectPerson(form);

        /*JFrame secondPanel = new JFrame();
        secondPanel.setLayout(new FlowLayout());
        secondPanel.setMinimumSize(new Dimension(500,500));
        secondPanel.setMaximumSize(new Dimension(500,500));

        JTextField display = new JTextField();
        display.setText("Are you sure?");
        secondPanel.add(display);
        secondPanel.pack();
        secondPanel.setVisible(true);

        JFrame gameboard;
        gameboard = frame;
        gameboard.pack();
        gameboard.setVisible(true);
*/
    }
}

