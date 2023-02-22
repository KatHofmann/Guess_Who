import java.util.ArrayList;

public class Portraits extends Interactables {
String name;
String pictureFile;
Boolean isFlipped;

    public Portraits(String name, String pictureFile) {
        this.name = name;
        this.pictureFile = pictureFile;
        this.isFlipped = false;
    }
}
