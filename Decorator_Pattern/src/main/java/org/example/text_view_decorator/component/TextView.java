package org.example.text_view_decorator.component;

public class TextView implements View{
    @Override
    public void draw() {
        System.out.print("->TextView:Displaying text->");
    }
}
