package StragetyPattern.TestClass;

import StragetyPattern.Strategy.taxiStrategy;
import StragetyPattern.interFace.CaculateStraget;

public class tranficCaculator {

    CaculateStraget mStraget;

    public static void main(String[] args) {

        tranficCaculator tranficCaculator = new tranficCaculator();

        tranficCaculator.setStrategy(new taxiStrategy());

        System.out.println("出租车价钱：" + tranficCaculator.caculatePrice(19));


    }

    public int caculatePrice(int km) {

        return mStraget.caculatePrice(km);

    }

    public void setStrategy(CaculateStraget caculateStraget) {

        this.mStraget = caculateStraget;

    }

}
