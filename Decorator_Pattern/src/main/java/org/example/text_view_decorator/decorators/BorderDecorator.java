package org.example.text_view_decorator.decorators;

import org.example.text_view_decorator.component.View;

public class BorderDecorator extends ViewDecorator {
    public BorderDecorator(View view) {
        super(view);
    }

    @Override
    public void draw() {
        view.draw();
        System.out.print("->BorderShowing:->");
    }
}
