package org.example.ice_cream_decorator.decorators;

import org.example.ice_cream_decorator.components.IceCream;

public abstract class IceCreamDecorator implements IceCream {
    protected IceCream speacialIceCream;
    public  IceCreamDecorator(IceCream iceCream){
        this.speacialIceCream=iceCream;
    }
    public String make(){
        return speacialIceCream.make();
    }
}
