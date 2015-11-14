package com.j2.figure;

public class AAFigureIngredientFactory implements FigureIngredientFactory {
    public Line createLine() {
        return new ThickLine();
    }
    public Color createColor() {
        return new GreenColor();
    }
    public Dot createDot() {
        return new SixDot();
    }
}