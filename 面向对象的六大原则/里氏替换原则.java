public class window {

    public void show(View child) {

        child.draw();

    }
}

public abstract class View {

    public abstract void draw();

    public void measure(int with, int height) {
        //������ͼ��С
    }

}

public class TextView extends View {
    @Override
    public void draw() {
        //�����ı�
    }
}

public class InmageView extends View {
    @Override
    public void draw() {
        //����ͼƬ
    }
}