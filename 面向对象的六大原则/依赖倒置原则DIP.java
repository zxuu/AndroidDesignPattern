public interface ImageCatch {

    public Bitmap get(String url);

    public void put(String url, Bitmap bmp);

}

public class MemmeryCatch implements ImageCatch {
    @Override
    public Bitmap get(String url) {
        return null;
    }

    @Override
    public void put(String url, Bitmap bmp) {
        //...............................
    }
}

public class DirCatch implements ImageCatch{
    @Override
    public Bitmap get(String url) {
        return null;
    }

    @Override
    public void put(String url, Bitmap bmp) {
        //.................................
    }
}

public class Test {

    //�����ڳ��󣬶�̬��
    ImageCatch imageCatch = new MemmeryCatch();

//    ImageCatch imageCatch = new DirCatch();

    public void disPlay(){

    }

}