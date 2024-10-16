package com.example.task1ing;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class RoundedRectangle extends Shape {
    double length;
    double width;
    double arcWidth;
    double arcHeight;

    public RoundedRectangle(Color color, double x, double y, double length, double width, double arcWidth, double arcHeight) {
        super(color, x, y);
        this.length = length;
        this.width = width;
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillRoundRect(x, y, length, width, arcWidth, arcHeight);
    }

    @Override
    public String toString() {
        return "RoundedRectangle color is " + color + " and area is: " + area();
    }
}
