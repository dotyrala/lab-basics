package pl.wszib;

import java.math.BigInteger;

public class MyClass extends MyAbstractClass implements MyInterface, MyInterface2 {
    int myInt;
    Integer myInteger;
    Long longus;
    long longer;
    BigInteger myBigInt;

    @Override
    public void doCalculation() {

        //autoboxing
        Integer myLocalInt = myInt;
        myBigInt = new BigInteger("111111111111111111111111111111111111111111111111111111");
        //auto unboxing
        int myLocalInte = myInteger;
    }

    @Override
    public void doRun() {

    }

    @Override
    public void doRun2() {

    }
}
