package com.example.task1ing;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Square extends Shape {
    double side;

    public Square(Color color, double x, double y, double side) {
        super(color, x, y);
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillRect(x, y, side, side);
    }

    @Override
    public String toString() {
        return "Square color is " + color + " and area is: " + area();
    }
}
