package Q2;

// Concrete Factory: Linux
public class LinuxFactory implements GUIFactory {
    @Override
    public AbstractTextField createTextField() {
        return new LinuxTextField();
    }

    @Override
    public AbstractPushButton createPushButton() {
        return new LinuxPushButton();
    }

    @Override
    public AbstractListBox createListBox() {
        return new LinuxListBox();
    }
}