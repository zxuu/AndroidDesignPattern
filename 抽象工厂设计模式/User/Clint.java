package AbstractFactoryPattern.User;

import AbstractFactoryPattern.Factory.BaseFactory;
import AbstractFactoryPattern.Factory.Q3Factory;
import AbstractFactoryPattern.Factory.Q7Factory;

public class Clint {

    public static void main(String[] args) {

        BaseFactory baseFactory = new Q3Factory();

        baseFactory.createITire().tire();
        baseFactory.createIEnging().engine();

        baseFactory = new Q7Factory();

        baseFactory.createIEnging().engine();
        baseFactory.createITire().tire();

    }

}
