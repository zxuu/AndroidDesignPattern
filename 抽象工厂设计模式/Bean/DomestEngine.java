package AbstractFactoryPattern.Bean;

public class DomestEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
