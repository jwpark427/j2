package com.j2.figure;

public class YellowTriangle extends Figure {
    FigureIngredientFactory ingredientFactory;
 
    public YellowTriangle(FigureIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        line = ingredientFactory.createLine();
        color = ingredientFactory.createColor();
        dot = ingredientFactory.createDot();
    }
}
