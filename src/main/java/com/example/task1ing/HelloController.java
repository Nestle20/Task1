package com.example.task1ing;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private Canvas canvas;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private TextField numberOfShapesInput;

    private GraphicsContext gc;

    @FXML
    public void initialize() {
        gc = canvas.getGraphicsContext2D();
    }

    // Метод для очистки сцены
    private void clearCanvas() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    @FXML
    public void drawRectangle() {
        clearCanvas(); // Очистка сцены
        int count = Integer.parseInt(numberOfShapesInput.getText());
        double offsetX = 120; // Расстояние между фигурами по горизонтали
        for (int i = 0; i < count; i++) {
            Rectangle rectangle = new Rectangle(colorPicker.getValue(), 10 + i * offsetX, 50, 100, 50);
            rectangle.draw(gc);
        }
    }

    @FXML
    public void drawCircle() {
        clearCanvas(); // Очистка сцены
        int count = Integer.parseInt(numberOfShapesInput.getText());
        double offsetX = 120; // Расстояние между фигурами по горизонтали
        for (int i = 0; i < count; i++) {
            Circle circle = new Circle(colorPicker.getValue(), 10 + i * offsetX, 40, 40);
            circle.draw(gc);
        }
    }

    @FXML
    public void drawEllipse() {
        clearCanvas(); // Очистка сцены
        int count = Integer.parseInt(numberOfShapesInput.getText());
        double offsetX = 120; // Расстояние между фигурами по горизонтали
        for (int i = 0; i < count; i++) {
            Ellipse ellipse = new Ellipse(colorPicker.getValue(), 10 + i * offsetX, 50, 50, 20);
            ellipse.draw(gc);
        }
    }

    @FXML
    public void drawSquare() {
        clearCanvas(); // Очистка сцены
        int count = Integer.parseInt(numberOfShapesInput.getText());
        double offsetX = 120; // Расстояние между фигурами по горизонтали
        for (int i = 0; i < count; i++) {
            Square square = new Square(colorPicker.getValue(), 10 + i * offsetX, 60, 60);
            square.draw(gc);
        }
    }

    @FXML
    public void drawRoundedRectangle() {
        clearCanvas(); // Очистка сцены
        int count = Integer.parseInt(numberOfShapesInput.getText());
        double offsetX = 120; // Расстояние между фигурами по горизонтали
        for (int i = 0; i < count; i++) {
            RoundedRectangle roundedRectangle = new RoundedRectangle(colorPicker.getValue(), 10 + i * offsetX, 50, 100, 50, 20, 20);
            roundedRectangle.draw(gc);
        }
    }
}
