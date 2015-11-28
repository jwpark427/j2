package com.j2.figure;

public class SMFigureStore extends FigureStore {
    protected Figure createFigure(String item) {
        Figure figure = null;
        FigureIngredientFactory ingredientFactory=new SMFigureIngredientFactory();
        if (item.equals("five line")) {
            figure = new YellowTriangle(ingredientFactory);
            figure.setName("SM Style yellowtriangle");
        }
        if (item.equals("yellow color")) {
            figure = new YellowSquare(ingredientFactory);
            figure.setName("SM Style YellowSquare");
        }
        if (item.equals("five dot")) {
            figure = new YellowCircle(ingredientFactory);
            figure.setName("SM Style YellowCircle");
        }
        return figure;
    }
}