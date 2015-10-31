package com.j2.figure;

public abstract class Figure {
    String name;
    Line line;
    Color color;
    Dot dot;

    abstract void prepare();
    void draw() {
        System.out.println("Drawing the figure");
    }
    void color() {
        System.out.println("coloring for figure");
    }
    void decorate() {
        System.out.println("Decorating the figure");
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (line != null) {
            result.append(line);
            result.append("\n");
        }
        if (color != null) {
            result.append(color);
            result.append("\n");
        }
        if (dot != null) {
            result.append(dot);
            result.append("\n");
        }
        return result.toString();
    }
}

