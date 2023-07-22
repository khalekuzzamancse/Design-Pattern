package org.example.text_view_decorator.decorators;

import org.example.text_view_decorator.component.View;

abstract public class ViewDecorator implements View {
    protected View view;

    public ViewDecorator(View view) {
        this.view = view;
    }

    @Override
    public void draw() {
        view.draw();
    }
}
