package org.example.text_view_decorator.decorators;

import org.example.text_view_decorator.component.View;

public class ScrollDecorator extends ViewDecorator {
    public ScrollDecorator(View view) {
        super(view);
    }

    @Override
    public void draw() {
        view.draw();
        System.out.print("->ScrollEnabled:->");
    }
}
