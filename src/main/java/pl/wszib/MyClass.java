package pl.wszib;

public class MyClass extends MyAbstractClass implements MyInterface, MyInterface2 {
    int myInt;
    Integer myInteger;

    @Override
    public void doCalculation() {

        //autoboxing
        Integer myLocalInt = myInt;

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
