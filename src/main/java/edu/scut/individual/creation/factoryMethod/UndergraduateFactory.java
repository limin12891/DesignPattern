package edu.scut.individual.creation.factoryMethod;

/**
 * Created by limin on 2017/8/13.
 */
public class UndergraduateFactory implements IFactory{
    public LeiFeng createInstance() {
        return new Undergraduate();
    }
}
