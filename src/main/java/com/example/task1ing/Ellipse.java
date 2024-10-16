package com.example.task1ing;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Ellipse extends Shape {
    double radiusX;
    double radiusY;

    public Ellipse(Color color, double x, double y, double radiusX, double radiusY) {
        super(color, x, y);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    @Override
    double area() {
        return Math.PI * radiusX * radiusY;
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillOval(x, y, radiusX * 2, radiusY * 2);
    }

    @Override
    public String toString() {
        return "Ellipse color is " + color + " and area is: " + area();
    }
}
