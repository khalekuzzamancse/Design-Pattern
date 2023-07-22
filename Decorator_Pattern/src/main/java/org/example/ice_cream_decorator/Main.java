package org.example.ice_cream_decorator;

import org.example.ice_cream_decorator.components.IceCream;
import org.example.ice_cream_decorator.components.SimpleIceCream;
import org.example.ice_cream_decorator.decorators.HoneyDecorator;
import org.example.ice_cream_decorator.decorators.NuttyDecorator;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream =
                new NuttyDecorator(
                        new HoneyDecorator(new SimpleIceCream()
                        )
                );
        System.out.println(iceCream.make());

    }
}