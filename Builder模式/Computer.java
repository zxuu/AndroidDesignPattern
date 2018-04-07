package Builder模式;


public abstract class Computer {

    protected String mBoard;
    protected String mDisplay;
    protected String mOs;

    protected Computer() {}

    //设置主板
    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    //设置显示器
    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    //设置操作系统
    public abstract void setmOs();

    @Override
    public String toString() {
        return "computer [mBoard=" + mBoard + ", mDisplay=" + mDisplay + ", mOs" + mOs + "]";
    }
}
