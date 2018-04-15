package StragetyPattern.Strategy;

import StragetyPattern.interFace.CaculateStraget;

public class taxiStrategy implements CaculateStraget {
    @Override
    public int caculatePrice(int km) {
        //出租车价钱
        return 0;
    }
}
