package AbstractFactoryPattern.Bean;

public class SUVTire implements ITire {
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
