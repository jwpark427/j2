package com.j2.figure;

public class FigureTestDrive {
    public static void main(String[] args) {
        FigureStore smStore = new SMFigureStore();
        FigureStore jwStore = new JWFigureStore();
        FigureStore aaStore = new AAFigureStore();
        
        Figure figure = smStore.orderFigure("five line");
        System.out.println("Park make a " + figure + "\n");
 
        figure = smStore.orderFigure("yellow color");
        System.out.println("Jin make a " + figure + "\n");
        
        figure = smStore.orderFigure("five dot");
        System.out.println("Ho make a " + figure + "\n");
        
        figure = jwStore.orderFigure("thick line");
        System.out.println("Woo make a " + figure + "\n");
        
        figure = jwStore.orderFigure("green color");
        System.out.println("Kim make a " + figure + "\n");
        
        figure = jwStore.orderFigure("six dot");
        System.out.println("Kim make a " + figure + "\n");
        
        figure = aaStore.orderFigure("thick line");
        System.out.println("Kang make a " + figure + "\n");
        
        figure = aaStore.orderFigure("green color");
        System.out.println("Jung make a " + figure + "\n");
        
        figure = aaStore.orderFigure("six dot");
        System.out.println("Lee make a " + figure + "\n");
	}
    	
    
}