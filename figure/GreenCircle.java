package com.j2.figure;

public class GreenCircle extends Figure {
    FigureIngredientFactory ingredientFactory;
 
    public GreenCircle(FigureIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    void prepare() {
        System.out.println("Preparing " + name);
        line = ingredientFactory.createLine();
        color = ingredientFactory.createColor();
        dot = ingredientFactory.createDot();
    }
}
