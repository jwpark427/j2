package com.j2.figure;

public class SMFigureIngredientFactory implements FigureIngredientFactory {
    public Line createLine() {
        return new DoubleLine();
    }
    public Color createColor() {
        return new YellowColor();
    }
    public Dot createDot() {
        return new FiveDot();
    }
}