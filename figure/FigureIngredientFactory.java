package com.j2.figure;

public interface FigureIngredientFactory {
    public Line createLine();
    public Color createColor();
    public Dot createDot();
}
