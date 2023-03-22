import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Portraits extends JPanel implements MouseListener {
String name;
String pictureFile;
Boolean isFlipped;
int index;

    public Portraits(String name, String pictureFile) {
        this.name = name;
        this.pictureFile = pictureFile;
        this.isFlipped = false;
        this.index = 0;
        super.addMouseListener(this);
    }
    public static void main(String[] arguments) throws IOException{

        JPanel panel = new JPanel();

        BufferedImage image = ImageIO.read(
                new File("C:\\Users\\kathr\\CMPSCI 221\\Guess Who\\Portrait images"));
        JLabel label = new JLabel(new ImageIcon(image));
        panel.add(label);

        //main window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add the Jpanel to the main window
        frame.add(panel);

        frame.pack();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if(isFlipped == false){
            setVisible(false);
            boolean isFlipped = true;
        } else{
            setVisible(true);
            boolean isFlipped = false;
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
}
