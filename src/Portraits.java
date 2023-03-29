import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Portraits extends JPanel{
    Boolean isFlipped;
    JPanel panel;
    ImageIcon picture;
    private MainGuessWho form;
    private static ArrayList<JPanel> portraits;

    public Portraits(MainGuessWho form,JPanel panel) {
        this.form = form;
        this.panel = panel;
        this.isFlipped = false;
    }

    private void initializePortraits() {
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
        form.get_002().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(isVisible()){
                    setVisible(false);
                }else{
                    setVisible(true);
                }
            }

        });
    }

    /*@Override
    public void mouseClicked(MouseEvent e) {
        if (isFlipped == false) {
            setVisible(false);
            isFlipped = true;
        } else {
            setVisible(true);
            isFlipped = false;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

     */

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MainGuessWho form = new MainGuessWho();
        JPanel content = form.getGameBoard();
        frame.setContentPane(content);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Portraits pictures = new Portraits(form, new JPanel());
        pictures.initializePortraits();

        for (JPanel panel : pictures.portraits) {
            int i = pictures.portraits.indexOf(panel);
            ImageIcon image;
            image = new ImageIcon("Portrait images/Mii " + i + ".jpg");
            ImageIcon scaledImage = new ImageIcon(image.getImage().getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH));
            JButton label = new JButton(scaledImage);
            panel.add(label);

            label.addActionListener(e->{
                //label.setVisible(!label.isVisible());
                label.setBackground(Color.black);
            });
        }

    }
}

