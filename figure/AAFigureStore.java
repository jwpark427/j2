package com.j2.figure;

public class AAFigureStore extends FigureStore {
    protected Figure createFigure(String item) {
        Figure figure = null;
        FigureIngredientFactory ingredientFactory=new AAFigureIngredientFactory();
        
	if (item.equals("thick line")) {
            figure = new GreenTriangle(ingredientFactory);
            figure.setName("AA Style Green Triangle");
        }
        if (item.equals("green color")) {
            figure = new GreenSquare(ingredientFactory);
            figure.setName("AA Style Green Square");
        }
 	if (item.equals("six dot")) {
            figure = new GreenCircle(ingredientFactory);
            figure.setName("AA Style Green Circle");
        }
        return figure;
    }
}