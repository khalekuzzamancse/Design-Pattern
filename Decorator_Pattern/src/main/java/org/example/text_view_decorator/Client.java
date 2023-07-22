package org.example.text_view_decorator;

import org.example.text_view_decorator.component.TextView;
import org.example.text_view_decorator.component.View;
import org.example.text_view_decorator.decorators.BorderDecorator;
import org.example.text_view_decorator.decorators.ScrollDecorator;

public class Client {
    public static void main(String[] args) {
        View view = new BorderDecorator(new ScrollDecorator(new TextView()));
        view.draw();

    }
}
