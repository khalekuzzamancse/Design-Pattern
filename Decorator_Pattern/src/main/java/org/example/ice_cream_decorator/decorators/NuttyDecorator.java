package org.example.ice_cream_decorator.decorators;

import org.example.ice_cream_decorator.components.IceCream;

public class NuttyDecorator extends IceCreamDecorator {
    public NuttyDecorator(IceCream iceCream) {
        super(iceCream);
    }

    private String addNut() {
        return " nuts added";
    }

    public String make() {
        return speacialIceCream.make() + addNut();
    }
}
