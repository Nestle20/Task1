package com.example.task1ing;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(Color color, double x, double y, double length, double width) {
        super(color, x, y);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillRect(x, y, length, width);
    }

    @Override
    public String toString() {
        return "Rectangle color is " + color + " and area is: " + area();
    }
}
