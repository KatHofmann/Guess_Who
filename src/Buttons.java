public class Buttons extends Interactables {

    String buttonType;

    public Buttons(String type, String buttonType) {
        super(type);
        this.buttonType = buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }

    public String getButtonType() {
        return buttonType;
    }
}
