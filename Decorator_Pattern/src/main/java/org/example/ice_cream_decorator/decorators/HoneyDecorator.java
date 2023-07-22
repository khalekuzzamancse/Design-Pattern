package org.example.ice_cream_decorator.decorators;

import org.example.ice_cream_decorator.components.IceCream;

public class HoneyDecorator extends IceCreamDecorator {
    public HoneyDecorator(IceCream iceCream) {
        super(iceCream);
    }

    private String addHoney() {
        return " honey added ";
    }

    public String make() {
        return speacialIceCream.make() + addHoney();
    }
}
