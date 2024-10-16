package com.example.task1ing;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Circle extends Shape {
    double radius;

    public Circle(Color color, double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + color + " and area is: " + area();
    }
}
