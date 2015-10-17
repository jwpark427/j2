package com.j2.figure;

public class RedTriangle extends Figure {
    FigureIngredientFactory ingredientFactory;
 
    public RedTriangle(FigureIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        line = ingredientFactory.createLine();
        color = ingredientFactory.createColor();
        dot = ingredientFactory.createDot();
    }
}
