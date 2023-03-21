import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Portraits extends GamePlay {
String name;
String pictureFile;
Boolean isFlipped;
int index;

    public Portraits(String name, String pictureFile) {
        this.name = name;
        this.pictureFile = pictureFile;
        this.isFlipped = false;
        this.index = 0;
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


    }





}
