package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Bean.IEngine;
import AbstractFactoryPattern.Bean.ITire;

public abstract class BaseFactory {

    public abstract ITire createITire();

    public abstract IEngine createIEnging();

}
