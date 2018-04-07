public class window {

    public void show(View child) {

        child.draw();

    }
}

public abstract class View {

    public abstract void draw();

    public void measure(int with, int height) {
        //测量视图大小
    }

}

public class TextView extends View {
    @Override
    public void draw() {
        //绘制文本
    }
}

public class InmageView extends View {
    @Override
    public void draw() {
        //绘制图片
    }
}