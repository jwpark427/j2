package com.j2.figure;

public abstract class FigureStore {
 
    protected abstract Figure createFigure(String item);
 
    public Figure orderFigure(String type) {
        Figure figure = createFigure(type);
        System.out.println("--- Drawing a " + figure.getName() + " ---");
        figure.prepare();
        figure.draw();
        figure.color();
        figure.decorate();
        return figure;
    }
}