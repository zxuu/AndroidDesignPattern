package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Bean.DomestEngine;
import AbstractFactoryPattern.Bean.NormalTire;
import AbstractFactoryPattern.Bean.IEngine;
import AbstractFactoryPattern.Bean.ITire;

public class Q3Factory extends BaseFactory {
    @Override
    public ITire createITire() {
        return new NormalTire();
    }

    @Override
    public IEngine createIEnging() {
        return new DomestEngine();
    }
}
