import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Portraits extends JPanel implements MouseListener {
    Boolean isFlipped;
    JPanel picture;
    private static MainGuessWho form;

    public Portraits(MainGuessWho form, JPanel picture) {
        this.form = form;
        this.picture = picture;
        this.isFlipped = false;
        super.addMouseListener(this);
    }


    public static void main(String[] args) throws Exception {
        ArrayList<JPanel> portraits = new ArrayList<JPanel>();
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

    }

    public void imageImport(JPanel panel){
        BufferedImage image;
        try{
            image = ImageIO.read(new File("/Images/Mii 1.jpg"));
            panel.add(new ImageIcon(image));
        } catch (IOException ex) {
            // handle exception
        }
    }




    @Override
    public void mouseClicked(MouseEvent e) {
        if (isFlipped == false) {
            setVisible(false);
            boolean isFlipped = true;
        } else {
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
