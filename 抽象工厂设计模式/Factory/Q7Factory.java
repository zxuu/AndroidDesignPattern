package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Bean.ImportEnging;
import AbstractFactoryPattern.Bean.SUVTire;
import AbstractFactoryPattern.Bean.IEngine;
import AbstractFactoryPattern.Bean.ITire;

public class Q7Factory extends BaseFactory {
    @Override
    public ITire createITire() {
        return new SUVTire();
    }

    @Override
    public IEngine createIEnging() {
        return new ImportEnging();
    }
}
