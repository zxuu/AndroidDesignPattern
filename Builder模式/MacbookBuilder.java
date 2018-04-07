package Builder模式;

public class MacbookBuilder extends Builder {

    private Computer computer = new MacBook();

    @Override
    public void builderBoard(String string) {
        computer.setmBoard(string);
    }

    @Override
    public void builderDisplay(String display) {
        computer.setmDisplay(display);
    }

    @Override
    public void builderOs() {
        computer.setmOs();
    }

    @Override
    public Computer creat() {
        return computer;
    }
}
