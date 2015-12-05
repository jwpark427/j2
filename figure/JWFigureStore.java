package com.j2.figure;

public class JWFigureStore extends FigureStore {
    protected Figure createFigure(String item) {
        Figure figure = null;
        FigureIngredientFactory ingredientFactory=new JWFigureIngredientFactory();
        if (item.equals("thick line")) {
            figure = new RedTriangle(ingredientFactory);
            figure.setName("JW Style Red Triangle");
        }
        if (item.equals("green color")) {
            figure = new RedSquare(ingredientFactory);
            figure.setName("JW Style Red Square");
        }
        
        if (item.equals("six dot")) {
            figure = new RedCircle(ingredientFactory);
            figure.setName("JW Style Red Circle");
        }
        return figure;
    }
}