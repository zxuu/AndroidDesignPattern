package StragetyPattern.Strategy;

import StragetyPattern.interFace.CaculateStraget;

public class busStrategy implements CaculateStraget {
    @Override
    public int caculatePrice(int km) {
        //公交车价钱
        return 0;
    }
}
