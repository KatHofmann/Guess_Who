import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;




public class Portraits extends MainGuessWho{
    JPanel panel;
    private MainGuessWho form;
    private static ArrayList<JPanel> portraits;
    ArrayList<String> strings = new ArrayList<>();

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

        strings.add("Jack");
        strings.add("Armando");
        strings.add("Bob");
        strings.add("Thomas");
        strings.add("Chad");
        strings.add("Terry");
        strings.add("Susan");
        strings.add("Katie");
        strings.add("Alex");
        strings.add("Karen");
        strings.add("Britney");
        strings.add("Sally");
        strings.add("Kayla");
        strings.add("Brianna");
        strings.add("Chelsea");
        strings.add("Mia");
        strings.add("Candice");
        strings.add("Nikki");
        strings.add("Aaron");
        strings.add("Hanna");
        strings.add("Valerie");
        strings.add("Greg");
        strings.add("Marie");
        strings.add("Fred");

        for (JPanel panel : picture.portraits) {
            int i = picture.portraits.indexOf(panel);
            ImageIcon image;
            image = new ImageIcon("Portrait images/Mii " + i + ".jpg");
            ImageIcon scaledImage = new ImageIcon(image.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH));
            JButton label = new JButton(scaledImage);
            label.setSize(panel.getSize());
            label.setBackground(Color.white);
            name.setForeground(Color.black);
            name.setText(strings.get(i));
            label.setText(name.getText());
            label.setHorizontalTextPosition(SwingConstants.CENTER);
            label.setVerticalTextPosition(SwingConstants.BOTTOM);

            panel.add(label);




            label.addActionListener(e->{
                if(label.getBackground() == Color.black) {
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
    public JPanel selectPerson(MainGuessWho form){
        JPanel person = form.getPersonPanel();
        ImageIcon image;
        Random rand = new Random();
        int i = rand.nextInt(24);
        image = new ImageIcon("Portrait images/Mii "+i+".jpg");
        JButton label = new JButton(image);
        label.setBackground(Color.white);
        person.add(label);

        //Gives the Main Person a Name
        label.setText(strings.get(i));
        label.setForeground(Color.black);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);
        person.add(label);

        return person;
    }

    public static void main(String[] args) {

        MainGuessWho form = new MainGuessWho();
        Portraits pictures = new Portraits(form, new JPanel());
        pictures.initializePortraits(pictures);
        pictures.selectPerson(form);

        MainGuessWho form2 = new MainGuessWho();
        Portraits pics = new Portraits(form2, new JPanel());
        pics.initializePortraits(pics);
        pics.selectPerson(form2);


        GuessWhoFrame gwFrame = new GuessWhoFrame(1, form, form2);
        gwFrame.setVisible(true);





    }
}

