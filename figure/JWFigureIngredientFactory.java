package com.j2.figure;

public class JWFigureIngredientFactory implements FigureIngredientFactory {
    public Line createLine() {
        return new ThinLine();
    }
    public Color createColor() {
        return new RedColor();
    }
    public Dot createDot() {
        return new FourDot();
    }
}


