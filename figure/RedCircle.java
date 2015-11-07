package com.j2.figure;

public class RedCircle extends Figure {
    FigureIngredientFactory ingredientFactory;
 
    public RedCircle(FigureIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        line = ingredientFactory.createLine();
        color = ingredientFactory.createColor();
        dot = ingredientFactory.createDot();
    }
}
