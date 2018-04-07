package Builder模式;

public abstract class Builder {
    //设置主机
    public abstract void builderBoard(String string);

    //设置显示器
    public abstract void builderDisplay(String display);

    //设置操作系统
    public abstract void builderOs();

    //创建Computer
    public abstract Computer creat();
}
